package com.example.ejercicio4

import android.content.Context

class Prefs(val context: Context) {
    val DATABASE = "MyDB"
    val FULLNAME = "FullName"
    val USER_NAME = "UserName"
    val EMAIL = "Email"
    val PASSWORD = "Password"
    val REPASS = "Re-type Password"
    val GENDRE = "Famale"
    val storage = context.getSharedPreferences(DATABASE, Context.MODE_PRIVATE)

    fun saveName(name:String){
        storage.edit().putString(USER_NAME,name).apply()
    }

    fun saveFullName(fullname:String){
        storage.edit().putString(FULLNAME,fullname).apply()
    }
    fun saveEmail(email:String){
        storage.edit().putString(EMAIL,email).apply()
    }

    fun savePassword(password:String){
        storage.edit().putString(PASSWORD,password).apply()
    }
    fun saveRePass(rePass:String){
        storage.edit().putString(REPASS,rePass).apply()
    }

    fun saveGendre(gendre:String){
        storage.edit().putString(GENDRE,gendre).apply()
    }
    fun getName():String{
        return storage.getString(USER_NAME, "")!!
    }
    fun getFullName():String{
        return storage.getString(FULLNAME, "")!!
    }
    fun getEMail():String{
        return storage.getString(EMAIL, "")!!
    }
    fun getPassword():String{
        return storage.getString(PASSWORD, "")!!
    }
    fun getRePAss():String{
        return storage.getString(REPASS, "")!!
    }
    fun getGendre():String{
        return storage.getString(GENDRE, "")!!
    }
    fun wipeData(){
        storage.edit().clear().apply()
    }
}