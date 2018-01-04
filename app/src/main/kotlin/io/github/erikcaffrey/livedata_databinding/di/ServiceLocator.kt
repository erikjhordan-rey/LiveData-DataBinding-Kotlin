package io.github.erikcaffrey.livedata_databinding.di

import io.github.erikcaffrey.livedata_databinding.model.DcCharacterDataSource
import io.github.erikcaffrey.livedata_databinding.model.DcCharacterRepository

object ServiceLocator {

  private val dcCharacterDataSource: DcCharacterDataSource = DcCharacterDataSource()

  val dcCharacterRepository = DcCharacterRepository(dcCharacterDataSource)

}