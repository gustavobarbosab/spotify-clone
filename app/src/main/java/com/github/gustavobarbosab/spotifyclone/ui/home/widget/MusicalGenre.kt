package com.github.gustavobarbosab.spotifyclone.ui.home.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.github.gustavobarbosab.spotifyclone.R
import com.github.gustavobarbosab.spotifyclone.databinding.ComponentGenresBinding

class MusicalGenre @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val binding = ComponentGenresBinding.inflate(LayoutInflater.from(context), this)

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.MusicalGenre)
        val title = typedArray.getString(R.styleable.MusicalGenre_genreTitle)
        setTitle(title)
        typedArray.recycle()
    }

    fun setTitle(title: String?) {
        binding.sectionTitle.text = title
    }
}