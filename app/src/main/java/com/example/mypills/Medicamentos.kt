package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Medicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicamentos)

        val textMedicamento1 = findViewById<TextView>(R.id.textViewMedicamento1)
        val textMedicamento2 = findViewById<TextView>(R.id.textViewMedicamento2)
        val textMedicamento3 = findViewById<TextView>(R.id.textViewMedicamento3)
        val textFormula = findViewById<TextView>(R.id.textViewFormula1)
        val btnCrearMedicina = findViewById<TextView>(R.id.btnCrearMedicamento)
        val btnVolver = findViewById<ImageView>(R.id.imageViewCerrarMed)

        btnVolver.setOnClickListener{
            val salir = Intent(this, Login::class.java)
            startActivity(salir)
        }

        btnCrearMedicina.setOnClickListener{
            val crearMedicina = Intent(this, EliminarMedicamentos::class.java)
            startActivity(crearMedicina)
        }

        textFormula.setOnClickListener{
            val eliminarFormula = Intent(this, EliminarFormula::class.java)
            startActivity(eliminarFormula)
        }

        textMedicamento1.setOnClickListener{
            val eliminarMedicamento = Intent(this, CrearMedicina::class.java)
            startActivity(eliminarMedicamento)
        }

        textMedicamento2.setOnClickListener{
            val eliminarMedicamento = Intent(this, CrearMedicina::class.java)
            startActivity(eliminarMedicamento)
        }

        textMedicamento3.setOnClickListener{
            val eliminarMedicamento = Intent(this, CrearMedicina::class.java)
            startActivity(eliminarMedicamento)
        }

    }
}