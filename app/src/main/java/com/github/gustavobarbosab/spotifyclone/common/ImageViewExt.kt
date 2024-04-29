package com.github.gustavobarbosab.spotifyclone.common

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadFromUrl(url: String) {
    Glide
        .with(this.context)
        .load(url)
        .centerCrop()
        .into(this)
}