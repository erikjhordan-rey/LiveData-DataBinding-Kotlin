package io.github.erikcaffrey.livebinding.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import io.github.erikcaffrey.livebinding.view.images.GlideApp

@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, url: String) {
    GlideApp.with(imageView.context).load(url).into(imageView)
}
