package com.example.mypills
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLoginE = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegistrarse)

        btnLoginE.setOnClickListener{
            val ppal = Intent(this, Principal::class.java)
            startActivity(ppal)
        }

        btnRegister.setOnClickListener{
            val regis = Intent(this, Registrarse::class.java)
            startActivity(regis)
        }

    }
}