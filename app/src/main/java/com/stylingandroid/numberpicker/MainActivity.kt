package com.stylingandroid.numberpicker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stylingandroid.numberpicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.numberPicker.maxValue = MAX_NUMBER
    }

    companion object {
        private const val MAX_NUMBER = 10
    }
}
