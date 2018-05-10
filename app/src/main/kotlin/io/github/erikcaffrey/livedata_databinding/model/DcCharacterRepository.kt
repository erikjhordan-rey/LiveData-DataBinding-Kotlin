package io.github.erikcaffrey.livedata_databinding.model

import java.util.Timer
import java.util.Random
import java.util.TimerTask
import java.util.concurrent.TimeUnit

typealias DcCharacterCommand = (List<DcCharacter>) -> Unit

class DcCharacterRepository constructor(private val dcCharacterDataSource: DcCharacterDataSource) {

    companion object {
        private const val PERIOD_SECONDS: Long = 2
        private const val MIN_INDEX = 0
    }

    private val timer = Timer()
    private val random = Random()
    private val period = TimeUnit.SECONDS.toMillis(PERIOD_SECONDS)

    internal fun receiverDcCharacterList(dcCommand: DcCharacterCommand) {
        timer.schedule(object : TimerTask() {
            override fun run() {
                val dcCharacterList = dcCharacterDataSource.all
                var randomMax = random.nextInt(dcCharacterList.size)

                when (randomMax) {
                    MIN_INDEX -> {
                        randomMax += 1
                    }
                }

                dcCommand.invoke(dcCharacterList.subList(MIN_INDEX, randomMax))
            }
        }, period, period)
    }
}
