package io.github.erikcaffrey.livedatadatabinding.view

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.erikcaffrey.livedatadatabinding.R
import io.github.erikcaffrey.livedatadatabinding.model.DcCharacter

class DcCharacterBinderAdapter : RecyclerView.Adapter<DcCharacterBinderHolder>() {
    private var dcCharacterList: List<DcCharacter> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            DcCharacterBinderHolder(DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_dc_character,
                    parent,
                    false))

    override fun onBindViewHolder(holder: DcCharacterBinderHolder, position: Int) =
            holder.bind(dcCharacterList[position])

    override fun getItemCount() = dcCharacterList.size
    fun setDcCharacterList(dcCharacterList: List<DcCharacter>) {
        this.dcCharacterList = dcCharacterList
        notifyDataSetChanged()
    }
}