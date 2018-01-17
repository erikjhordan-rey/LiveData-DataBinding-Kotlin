package io.github.erikcaffrey.livedata_databinding.view

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.erikcaffrey.livedata_databinding.R
import io.github.erikcaffrey.livedata_databinding.model.DcCharacter

class DcCharacterBinderAdapter : RecyclerView.Adapter<DcCharacterBinderHolder> {

    private val dcCharacterListMutableLive: MutableLiveData<List<DcCharacter>>

    constructor(lifecycleOwner: LifecycleOwner, dcCharacterListMutableLive: MutableLiveData<List<DcCharacter>>) : super() {
        this.dcCharacterListMutableLive = dcCharacterListMutableLive

        this.dcCharacterListMutableLive.observe(lifecycleOwner, Observer {
            notifyDataSetChanged()
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcCharacterBinderHolder {
        val viewDataBinding: ViewDataBinding? = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.item_dc_character, parent, false)
        return DcCharacterBinderHolder(viewDataBinding!!)
    }

    override fun onBindViewHolder(holder: DcCharacterBinderHolder, position: Int) {
        val dcCharacter = dcCharacterListMutableLive.value?.get(position)
        if (dcCharacter != null) {
            holder.bind(dcCharacter)
        }
    }

    override fun getItemCount() = dcCharacterListMutableLive.value!!.size
}
