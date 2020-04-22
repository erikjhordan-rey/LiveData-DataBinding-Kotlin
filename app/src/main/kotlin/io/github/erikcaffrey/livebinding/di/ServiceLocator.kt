package io.github.erikcaffrey.livebinding.di

import androidx.lifecycle.ViewModelProvider
import io.github.erikcaffrey.livebinding.model.DcCharacterDataSource
import io.github.erikcaffrey.livebinding.model.DcCharacterRepository
import io.github.erikcaffrey.livebinding.view.DcCharacterActivity
import io.github.erikcaffrey.livebinding.viewmodel.DcCharacterViewModel
import io.github.erikcaffrey.livebinding.viewmodel.DcCharacterViewModelFactory

object ServiceLocator {

    private val dcCharacterDataSource: DcCharacterDataSource = DcCharacterDataSource()

    private val dcCharacterRepository = DcCharacterRepository(dcCharacterDataSource)

    fun getDcCharacterViewModel(dcCharacterActivity: DcCharacterActivity) =
            ViewModelProvider(dcCharacterActivity, DcCharacterViewModelFactory(dcCharacterRepository))
                    .get(DcCharacterViewModel::class.java)
}
