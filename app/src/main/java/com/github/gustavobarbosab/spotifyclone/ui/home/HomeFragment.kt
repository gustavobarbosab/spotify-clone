package com.github.gustavobarbosab.spotifyclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.gustavobarbosab.spotifyclone.databinding.FragmentHomeBinding
import com.github.gustavobarbosab.spotifyclone.ui.home.adapter.MusicSectionAdapter
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
        binding.firstSectionTitle.text = "Rock"
        val list = listOf(
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
            MusicModel(
                "1",
                "https://indiater.com/wp-content/uploads/2021/06/Free-Music-Album-Cover-Art-Banner-Photoshop-Template.jpg",
                "Slipknot"
            ),
        )
        val adapter = MusicSectionAdapter(list)
        binding.firstSectionList.adapter = adapter
    }
}