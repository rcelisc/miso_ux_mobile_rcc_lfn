package com.example.mypills

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

        val btnVolver = findViewById<ImageView>(R.id.imageViewBack)

        btnVolver.setOnClickListener{
            val regis = Intent(this, Login::class.java)
            startActivity(regis)
        }


    }
}