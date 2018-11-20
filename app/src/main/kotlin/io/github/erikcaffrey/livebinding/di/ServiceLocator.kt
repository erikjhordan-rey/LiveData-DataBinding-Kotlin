package io.github.erikcaffrey.livebinding.di

import io.github.erikcaffrey.livebinding.model.DcCharacterDataSource
import io.github.erikcaffrey.livebinding.model.DcCharacterRepository

object ServiceLocator {

    private val dcCharacterDataSource: DcCharacterDataSource = DcCharacterDataSource()

    val dcCharacterRepository = DcCharacterRepository(dcCharacterDataSource)
}
