package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CrearMedicina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_medicina)



        val btnVolverMedicamentos = findViewById<Button>(R.id.btnEditarMedicamento)
        val btnSalir = findViewById<ImageView>(R.id.imageViewCerrarDetalleMedicamentos)
        val btnVolver = findViewById<ImageView>(R.id.imageViewBackDetalleMedicamentos)


        btnVolver.setOnClickListener{
            val medicamnetos = Intent(this, Medicamentos::class.java)
            startActivity(medicamnetos)
        }

        btnSalir.setOnClickListener{
            val medicamnetos = Intent(this, Login::class.java)
            startActivity(medicamnetos)
        }

        btnVolverMedicamentos.setOnClickListener{
            val medicamnetos = Intent(this, Medicamentos::class.java)
            startActivity(medicamnetos)
        }

        val btnVolverMedicamentos1 = findViewById<Button>(R.id.btnEliminarMedicamento)

        btnVolverMedicamentos1.setOnClickListener{
            val medicamentos = Intent(this, Medicamentos::class.java)
            startActivity(medicamentos)
        }


    }
}