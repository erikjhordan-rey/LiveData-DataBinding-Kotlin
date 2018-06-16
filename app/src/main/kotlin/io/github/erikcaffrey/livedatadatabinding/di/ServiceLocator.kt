package io.github.erikcaffrey.livedatadatabinding.di

import io.github.erikcaffrey.livedatadatabinding.model.DcCharacterDataSource
import io.github.erikcaffrey.livedatadatabinding.model.DcCharacterRepository

object ServiceLocator {
    private val dcCharacterDataSource: DcCharacterDataSource = DcCharacterDataSource()
    val dcCharacterRepository = DcCharacterRepository(dcCharacterDataSource)
}