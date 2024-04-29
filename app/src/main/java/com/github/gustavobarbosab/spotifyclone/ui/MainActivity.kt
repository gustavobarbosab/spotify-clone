package com.github.gustavobarbosab.spotifyclone.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.gustavobarbosab.spotifyclone.R
import com.github.gustavobarbosab.spotifyclone.databinding.ActivityMainBinding
import com.github.gustavobarbosab.spotifyclone.ui.home.HomeFragment
import com.github.gustavobarbosab.spotifyclone.ui.library.LibraryFragment
import com.github.gustavobarbosab.spotifyclone.ui.search.SearchFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        setupViews()
    }

    private fun setupViews() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.search -> {
                    replaceFragment(SearchFragment())
                    true
                }

                R.id.library -> {
                    replaceFragment(LibraryFragment())
                    true
                }

                else -> true
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.main, fragment, null)
            .commit()
    }
}