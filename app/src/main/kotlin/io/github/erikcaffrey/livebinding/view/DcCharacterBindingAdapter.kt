package io.github.erikcaffrey.livebinding.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.github.erikcaffrey.livebinding.model.DcCharacter

@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView.context).load(url).into(imageView)
}

@BindingAdapter(value = ["android:characters"])
fun bindAdapter(recyclerView: RecyclerView, characters: List<DcCharacter>?) {
    val adapter = recyclerView.adapter
    characters?.let { if (adapter is DcCharacterBinderAdapter) adapter.setDcCharacterList(it) }
}
