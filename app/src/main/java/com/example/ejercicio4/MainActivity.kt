package com.example.ejercicio4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.example.ejercicio4.SharedPreference.Companion.prefs
import com.example.ejercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    private var gendre = "Famale"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b=ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.rbtnFemale.setOnClickListener { gendre = "Famale" }
        b.rbtnMale.setOnClickListener { gendre = "Male" }
        checkUserValues()
        initUI()
    }
//    Poner en Manifest La clase SharedPreference
    fun checkUserValues(){
        if(prefs.getFullName().isNotEmpty()){
        goAccess()
        }
    }
//    Esta función comprueva si ya se han guardado valores.
    fun initUI(){
        b.btnReg.setOnClickListener {
            accessSharedPreferences()
        }
    }
    fun accessSharedPreferences(){
        if (b.edFullName.text.toString().isNotEmpty()){
            prefs.saveFullName(b.edFullName.text.toString())
            prefs.saveName(b.edUser.text.toString())
            prefs.saveEmail(b.edMail.text.toString())
            prefs.savePassword(b.edPass.text.toString())
            prefs.saveRePass(b.edRePass.text.toString())
            prefs.saveGendre(gendre)
            if (b.edPass.text.toString() == b.edRePass.text.toString()) {
                goAccess()
            } else {
                Toast.makeText(this, "La contraseña no coincide", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Debe rellenar el nombre", Toast.LENGTH_SHORT).show()
        }

    }
    private fun goAccess(){
        startActivity(Intent(this,AccessActivity::class.java))
    }

//    TODO: navBar*, Shared Reference, inten
}