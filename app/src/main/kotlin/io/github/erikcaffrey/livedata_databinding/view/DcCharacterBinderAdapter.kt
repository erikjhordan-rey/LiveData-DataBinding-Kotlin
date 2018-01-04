package io.github.erikcaffrey.livedata_databinding.view

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.erikcaffrey.livedata_databinding.R
import io.github.erikcaffrey.livedata_databinding.model.DcCharacter

class DcCharacterBinderAdapter : RecyclerView.Adapter<DcCharacterBinderHolder>() {

    private var dcCharacterList: List<DcCharacter>

    init {
        dcCharacterList = emptyList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcCharacterBinderHolder {
        val viewDataBinding: ViewDataBinding? = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.item_dc_character, parent, false)
        return DcCharacterBinderHolder(viewDataBinding!!)
    }

    override fun onBindViewHolder(holder: DcCharacterBinderHolder, position: Int) {
        val dcCharacter = dcCharacterList[position]
        holder.bind(dcCharacter)
    }

    override fun getItemCount() = dcCharacterList.size

    fun setDcCharacterList(dcCharacterList: List<DcCharacter>) {
        this.dcCharacterList = dcCharacterList
    }

}
