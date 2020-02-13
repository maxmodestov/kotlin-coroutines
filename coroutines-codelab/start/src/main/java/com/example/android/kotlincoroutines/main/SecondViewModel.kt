package com.example.android.kotlincoroutines.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondViewModel : ViewModel() {
    fun doJob() {
        viewModelScope.launch {
            while (true) {
                println("doJob")
                delay(1000)
            }
        }
    }
}