package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CrearFormula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_formula)

        val btnVolverPrincipal = findViewById<Button>(R.id.btnCrearFormula)
        val btnSalir = findViewById<ImageView>(R.id.imageViewCerrarCrearFormula)
        val btnVolver = findViewById<ImageView>(R.id.imageViewBackCrearFormula)

        btnVolver.setOnClickListener{
            val ppal = Intent(this, Principal::class.java)
            startActivity(ppal)
        }

        btnSalir.setOnClickListener{
            val salir = Intent(this, Login::class.java)
            startActivity(salir)
        }

        btnVolverPrincipal.setOnClickListener{
            val crearFormula = Intent(this, Principal::class.java)
            startActivity(crearFormula)
        }

    }
}