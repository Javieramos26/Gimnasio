package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pantalla2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pantalla2)

        val etUsername = findViewById<EditText>(R.id.editTextText)
        val etPassword = findViewById<EditText>(R.id.editTextText2)
        val btnLogin = findViewById<Button>(R.id.button)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "por favor ingrese nombre y contraseña", Toast.LENGTH_SHORT)
                    .show()
            } else {

                if (username == "admin" && password == "12345") {
                    Toast.makeText(this, "Inicio de sesion exitosa", Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(this, "Usuario o contraseña invalida", Toast.LENGTH_SHORT).show()

                    val btn: Button = findViewById(R.id.button)
                    btn.setOnClickListener {

                        val intent: Intent = Intent(this, Pantalla3::class.java)
                        startActivity(intent)


                    }


                }
            }
        }
    }
}