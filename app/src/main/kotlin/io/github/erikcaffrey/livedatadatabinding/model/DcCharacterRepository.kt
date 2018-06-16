package io.github.erikcaffrey.livedatadatabinding.model

import java.util.*
import java.util.concurrent.TimeUnit

class DcCharacterRepository constructor(private val dcCharacterDataSource: DcCharacterDataSource) {
    companion object {
        private const val PERIOD_SECONDS: Long = 2
    }

    private val timer = Timer()
    private val period = TimeUnit.SECONDS.toMillis(PERIOD_SECONDS)
    var size = 0
    internal fun receiverDcCharacterList(dcCommand: (List<DcCharacter>) -> Unit) =
            timer.schedule(object : TimerTask() {
                override fun run() {
                    val dcCharacterList = dcCharacterDataSource.all()
                    when (size) {
                        dcCharacterList.size -> size = 0
                    }
                    dcCommand.invoke(dcCharacterList.subList(0, ++size))
                }
            }, 0, period)
}