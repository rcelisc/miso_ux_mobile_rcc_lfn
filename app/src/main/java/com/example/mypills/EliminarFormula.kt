package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EliminarFormula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eliminar_formula)

        val btnEditarFormula = findViewById<TextView>(R.id.btnEditarFormula)
        val btnEliminarFormula = findViewById<TextView>(R.id.btnEliminarFormula)

        btnEditarFormula.setOnClickListener{
            val mediamentos = Intent(this, Medicamentos::class.java)
            startActivity(mediamentos)
        }
        btnEliminarFormula.setOnClickListener{
            val mediamentos = Intent(this, Medicamentos::class.java)
            startActivity(mediamentos)
        }


    }
}