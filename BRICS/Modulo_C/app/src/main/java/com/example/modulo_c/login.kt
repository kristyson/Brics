package com.example.modulo_c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.statusBarColor = ContextCompat.getColor(this, R.color.amarelo)

        val textView7 = findViewById<TextView>(R.id.textView7)
        textView7.setOnClickListener {
            val intent = Intent(this,esqueceuSenha::class.java)
            startActivity(intent)
        }
        val singIn = findViewById<Button>(R.id.singIn)
        singIn.setOnClickListener {
            val intent = Intent(this,localizacao::class.java)
            startActivity(intent)
        }

        val singUp = findViewById<Button>(R.id.singUp)
        singUp.setOnClickListener {
            val intent = Intent(this,inscricao::class.java)
            startActivity(intent)
        }

    }
}