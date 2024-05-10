package com.github.gustavobarbosab.spotifyclone.ui.home.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.github.gustavobarbosab.spotifyclone.common.loadFromUrl
import com.github.gustavobarbosab.spotifyclone.databinding.ComponentHomeHeaderBinding

class HomeHeader @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val binding = ComponentHomeHeaderBinding.inflate(LayoutInflater.from(context), this)

    fun setImage(url: String) {
        binding.image.loadFromUrl(url)
    }

    fun setFirstButtonListener() {
    }
}