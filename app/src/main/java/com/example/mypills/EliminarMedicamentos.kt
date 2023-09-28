package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class EliminarMedicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eliminar_medicamentos)



        val btnVolver = findViewById<ImageView>(R.id.imageViewBackPpal)
        val btnCrearMedicina = findViewById<Button>(R.id.btnCrearMedicamMMM)
        val btnSalir = findViewById<ImageView>(R.id.imageViewCerrarCreMed)


        btnSalir.setOnClickListener{
            val salir = Intent(this, Login::class.java)
            startActivity(salir)
        }

        btnVolver.setOnClickListener{
            val volverMedicina = Intent(this, Medicamentos::class.java)
            startActivity(volverMedicina)
        }

        btnCrearMedicina.setOnClickListener{
            val crearMedicina = Intent(this, Medicamentos::class.java)
            startActivity(crearMedicina)
        }


    }
}