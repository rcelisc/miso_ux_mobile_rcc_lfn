package com.example.mypills

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Registrarse : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        val btnGrabRegistro = findViewById<Button>(R.id.btnGrabarRegistro)

        btnGrabRegistro.setOnClickListener{
            val regis = Intent(this, Login::class.java)
            startActivity(regis)
        }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            android.R.id.home -> {
//                // Realiza las acciones necesarias para volver a la pantalla anterior
//                onBackPressed() // O puedes usar una intención de navegación, si estás utilizando Navigation Component.
//                return true
//            }
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }



    }
}