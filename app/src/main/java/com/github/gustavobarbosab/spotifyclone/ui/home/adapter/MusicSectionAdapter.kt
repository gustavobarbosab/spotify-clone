package com.github.gustavobarbosab.spotifyclone.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.gustavobarbosab.spotifyclone.common.loadFromUrl
import com.github.gustavobarbosab.spotifyclone.databinding.ItemMusicSectionBinding
import com.github.gustavobarbosab.spotifyclone.ui.home.model.MusicModel

class MusicSectionAdapter(
    private val musics: List<MusicModel>
) : RecyclerView.Adapter<MusicSectionAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemMusicSectionBinding.inflate(layoutInflater, parent, false)
        return MusicViewHolder(binding)
    }

    override fun getItemCount(): Int = musics.size

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musics[position])
    }

    class MusicViewHolder(private val binding: ItemMusicSectionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(music: MusicModel) {
            binding.musicImage.loadFromUrl(music.imageUrl)
            binding.musicName.text = music.name
        }
    }
}