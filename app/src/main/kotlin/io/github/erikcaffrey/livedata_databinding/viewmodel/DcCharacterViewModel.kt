package io.github.erikcaffrey.livedata_databinding.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.github.erikcaffrey.livedata_databinding.di.ServiceLocator
import io.github.erikcaffrey.livedata_databinding.model.DcCharacter

class DcCharacterViewModel : ViewModel() {

    private val dcCharacterRepository = ServiceLocator.dcCharacterRepository
    private val dcCharacterListMutableLive = MutableLiveData<List<DcCharacter>>()

    init {
        dcCharacterListMutableLive.value = emptyList()

        dcCharacterRepository.receiverDcCharacterList { it ->
            dcCharacterListMutableLive.postValue(it)
        }
    }

    fun getDcCharacterList() = dcCharacterListMutableLive
}
