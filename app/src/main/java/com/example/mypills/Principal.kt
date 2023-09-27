package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val btnAgregarFormula = findViewById<Button>(R.id.btnAgregarFormula)
        val textFormula1 = findViewById<TextView>(R.id.textViewFormula1)
        val textFormula2 = findViewById<TextView>(R.id.textViewFormula2)
        val textFormula3 = findViewById<TextView>(R.id.textViewFormula3)

        btnAgregarFormula.setOnClickListener{
            val crearFormula = Intent(this, CrearFormula::class.java)
            startActivity(crearFormula)
        }

        textFormula1.setOnClickListener{
            val medicamentos1 = Intent(this, Medicamentos::class.java)
            startActivity(medicamentos1)
        }

        textFormula2.setOnClickListener{
            val medicamentos2 = Intent(this, Medicamentos::class.java)
            startActivity(medicamentos2)
        }

        textFormula3.setOnClickListener{
            val medicamentos3 = Intent(this, Medicamentos::class.java)
            startActivity(medicamentos3)
        }

    }
}