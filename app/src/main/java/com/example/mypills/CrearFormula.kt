package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CrearFormula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_formula)


    val btnVolverPrincipal = findViewById<Button>(R.id.btnCrearFormula)

    btnVolverPrincipal.setOnClickListener{
        val crearFormula = Intent(this, Principal::class.java)
        startActivity(crearFormula)
    }

    }
}