package io.github.erikjhordanrey.livebinding.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.github.erikjhordanrey.livebinding.model.DcCharacterRepository

@Suppress("UNCHECKED_CAST")
class DcCharacterViewModelFactory(private val dcCharacterRepository: DcCharacterRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DcCharacterViewModel::class.java)) {
            return DcCharacterViewModel(dcCharacterRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
