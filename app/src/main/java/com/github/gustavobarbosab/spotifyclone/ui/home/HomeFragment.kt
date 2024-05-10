package com.github.gustavobarbosab.spotifyclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.gustavobarbosab.spotifyclone.databinding.FragmentHomeBinding
import com.github.gustavobarbosab.spotifyclone.ui.home.model.MusicModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = mutableListOf<MusicModel>()
        repeat(10) {time ->
            val model = MusicModel(
            "$time",
            "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
            "$time Teste"
            )
            list.add(model)
        }
        binding.popSection.setMusicList(list)
    }
}