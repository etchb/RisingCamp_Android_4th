package com.bhongj.rc_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bhongj.rc_week1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.itemIconTintList = null
        binding.tlBody.tabIconTint = null
    }
}