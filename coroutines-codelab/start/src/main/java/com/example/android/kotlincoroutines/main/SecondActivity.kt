package com.example.android.kotlincoroutines.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.android.kotlincoroutines.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val viewModel = ViewModelProviders.of(this).get(SecondViewModel::class.java)
        viewModel.doJob()
    }
}