package io.github.erikcaffrey.livebinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.erikcaffrey.livebinding.di.ServiceLocator
import io.github.erikcaffrey.livebinding.model.DcCharacter

class DcCharacterViewModel : ViewModel() {

    private val dcCharacterRepository = ServiceLocator.dcCharacterRepository
    private val dcCharacterListMutableLive = MutableLiveData<List<DcCharacter>>()

    init {
        dcCharacterRepository.receiverDcCharacterList { it -> dcCharacterListMutableLive.postValue(it) }
    }

    fun getDcCharacterList() = dcCharacterListMutableLive as LiveData<List<DcCharacter>>
}
