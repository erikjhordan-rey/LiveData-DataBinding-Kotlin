package io.github.erikjhordanrey.livebinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.erikjhordanrey.livebinding.model.DcCharacter
import io.github.erikjhordanrey.livebinding.model.DcCharacterRepository

class DcCharacterViewModel(dcCharacterRepository: DcCharacterRepository) : ViewModel() {

    private val dcCharacterListMutableLive = MutableLiveData<List<DcCharacter>>()

    init {
        dcCharacterRepository.receiverDcCharacterList { dcCharacterListMutableLive.postValue(it) }
    }

    fun getDcCharacterList() = dcCharacterListMutableLive as LiveData<List<DcCharacter>>
}
