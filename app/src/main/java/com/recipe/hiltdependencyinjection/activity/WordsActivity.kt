package com.recipe.hiltdependencyinjection.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.recipe.hiltdependencyinjection.R
import com.recipe.hiltdependencyinjection.databinding.ActivityMainBinding

class WordsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        init()
    }

    private fun init() {
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.floatingActionButton.setOnClickListener {

        }
    }
}