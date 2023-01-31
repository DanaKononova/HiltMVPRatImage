package com.example.hiltmvphelloworld.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.hiltmvphelloworld.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val vm by viewModels<ImageViewModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.liveData.observe(this) {
           val imageView = findViewById<ImageView>(R.id.ivImage)
            Glide
                .with(this)
                .load(it.image)
                .into(imageView)
        }

        vm.getInfo()
    }
}