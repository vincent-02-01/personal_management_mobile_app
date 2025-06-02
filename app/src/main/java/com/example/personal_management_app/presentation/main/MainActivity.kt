package com.example.personal_management_app.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_management_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "Chào mừng đến ứng dụng Quản lý cá nhân!"
    }
}