package com.example.ejercicio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio4.databinding.ActivityPersonalDataBinding

class personalDataActivity : AppCompatActivity() {
    private lateinit var b:ActivityPersonalDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityPersonalDataBinding.inflate(layoutInflater)
        setContentView(b.root)

    }
}