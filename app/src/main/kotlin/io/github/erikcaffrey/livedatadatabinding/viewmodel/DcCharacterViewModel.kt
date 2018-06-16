package io.github.erikcaffrey.livedatadatabinding.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.github.erikcaffrey.livedatadatabinding.di.ServiceLocator
import io.github.erikcaffrey.livedatadatabinding.model.DcCharacter

class DcCharacterViewModel : ViewModel() {
    private val dcCharacterRepository = ServiceLocator.dcCharacterRepository
    private val dcCharacterListMutableLive = MutableLiveData<List<DcCharacter>>()

    init {
        dcCharacterRepository.receiverDcCharacterList(dcCharacterListMutableLive::postValue)
    }

    fun getDcCharacterList() = dcCharacterListMutableLive
}