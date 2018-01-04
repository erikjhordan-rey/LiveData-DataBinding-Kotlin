package io.github.erikcaffrey.livedata_databinding.view

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import io.github.erikcaffrey.livedata_databinding.BR
import io.github.erikcaffrey.livedata_databinding.model.DcCharacter


class DcCharacterBinderHolder constructor(private val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

  fun bind(dcCharacter: DcCharacter) {
    viewDataBinding.setVariable(BR.dcCharacter, dcCharacter)
    viewDataBinding.executePendingBindings()
  }

}
