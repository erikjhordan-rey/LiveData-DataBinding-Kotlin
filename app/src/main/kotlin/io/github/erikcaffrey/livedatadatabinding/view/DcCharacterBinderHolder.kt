package io.github.erikcaffrey.livedatadatabinding.view

import android.support.v7.widget.RecyclerView
import io.github.erikcaffrey.livedatadatabinding.databinding.ItemDcCharacterBinding
import io.github.erikcaffrey.livedatadatabinding.model.DcCharacter

class DcCharacterBinderHolder(private val viewDataBinding: ItemDcCharacterBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(dcCharacter: DcCharacter) {
        viewDataBinding.dcCharacter = dcCharacter
        viewDataBinding.executePendingBindings()
    }
}