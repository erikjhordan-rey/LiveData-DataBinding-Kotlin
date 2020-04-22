package io.github.erikjhordanrey.livebinding.view

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import io.github.erikjhordanrey.livebinding.BR
import io.github.erikjhordanrey.livebinding.model.DcCharacter

class DcCharacterBinderHolder constructor(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(dcCharacter: DcCharacter) {
        viewDataBinding.setVariable(BR.dcCharacter, dcCharacter)
        viewDataBinding.executePendingBindings()
    }
}
