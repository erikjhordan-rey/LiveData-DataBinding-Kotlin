package io.github.erikcaffrey.livebinding.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, url: String) {
    GlideApp.with(imageView.context).load(url).into(imageView)
}
