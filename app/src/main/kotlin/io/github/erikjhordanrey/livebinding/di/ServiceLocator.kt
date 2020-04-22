package io.github.erikjhordanrey.livebinding.di

import androidx.lifecycle.ViewModelProvider
import io.github.erikjhordanrey.livebinding.model.DcCharacterDataSource
import io.github.erikjhordanrey.livebinding.model.DcCharacterRepository
import io.github.erikjhordanrey.livebinding.view.DcCharacterActivity
import io.github.erikjhordanrey.livebinding.viewmodel.DcCharacterViewModel
import io.github.erikjhordanrey.livebinding.viewmodel.DcCharacterViewModelFactory

object ServiceLocator {

    private val dcCharacterDataSource: DcCharacterDataSource = DcCharacterDataSource()

    private val dcCharacterRepository = DcCharacterRepository(dcCharacterDataSource)

    fun getDcCharacterViewModel(dcCharacterActivity: DcCharacterActivity) =
            ViewModelProvider(dcCharacterActivity, DcCharacterViewModelFactory(dcCharacterRepository))
                    .get(DcCharacterViewModel::class.java)
}
