package io.github.erikcaffrey.livebinding.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.github.erikcaffrey.livebinding.model.DcCharacterRepository

class DcCharacterViewModelFactory(private val dcCharacterRepository: DcCharacterRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DcCharacterViewModel::class.java)) {
            return DcCharacterViewModel(dcCharacterRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
