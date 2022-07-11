package com.example.ejercicio4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio4.SharedPreference.Companion.prefs
import com.example.ejercicio4.databinding.ActivityAccessBinding

class AccessActivity : AppCompatActivity() {
    private lateinit var b:ActivityAccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAccessBinding.inflate(layoutInflater)
        setContentView(b.root)
        initUI()
    }
    @SuppressLint("SetTextI18n")
    fun initUI(){
        b.btnBack.setOnClickListener {
            prefs.wipeData()
            onBackPressed()
        }
        val fullName = prefs.getFullName()
        val userName = prefs.getName()
        val email = prefs.getEMail()
        val pass = prefs.getPassword()
        val rePass = prefs.getRePAss()
        val gendre = prefs.getGendre()
        b.tvData.text = """Full name: $fullName
            |User: $userName
            |Email: $email
            |Pass: $pass
            |Re-type Pass: $rePass
            |Gendre: $gendre
        """.trimMargin()

    }
}