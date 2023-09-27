package com.example.mypills

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EliminarMedicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eliminar_medicamentos)

        val btnCrearMedicina = findViewById<Button>(R.id.btnCrearMedicamMMM)

        btnCrearMedicina.setOnClickListener{
            val crearMedicina = Intent(this, Medicamentos::class.java)
            startActivity(crearMedicina)
        }


    }
}