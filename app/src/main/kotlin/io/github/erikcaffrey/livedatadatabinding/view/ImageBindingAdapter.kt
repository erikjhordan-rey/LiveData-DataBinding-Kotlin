package io.github.erikcaffrey.livedatadatabinding.view

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

@BindingAdapter("imgUrl")
fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView)
            .load(url)
            .into(imageView)
}