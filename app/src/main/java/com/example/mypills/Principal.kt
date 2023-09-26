package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val btnAgregarFormula = findViewById<Button>(R.id.btnAgregarFormula)

        btnAgregarFormula.setOnClickListener{
            val crearFormula = Intent(this, CrearFormula::class.java)
            startActivity(crearFormula)
        }

    }
}