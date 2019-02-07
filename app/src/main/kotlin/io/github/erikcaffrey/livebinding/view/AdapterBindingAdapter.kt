package io.github.erikcaffrey.livebinding.view

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.erikcaffrey.livebinding.model.DcCharacter

@BindingAdapter(value = ["android:characters"])
fun bindAdapter(recyclerView: RecyclerView, characters: List<DcCharacter>?) {
    val adapter = recyclerView.adapter
    characters?.let {
        if (adapter is DcCharacterBinderAdapter) {
            adapter.setDcCharacterList(it)
        }
    }
}