package com.example.ejercicio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.ejercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    private var gendre = R.string.famale
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b=ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.rbtnFemale.setOnClickListener { gendre = R.string.famale }
        b.rbtnMale.setOnClickListener { gendre = R.string.male }
    }

//    TODO: navBar, Shared Reference, inten
}