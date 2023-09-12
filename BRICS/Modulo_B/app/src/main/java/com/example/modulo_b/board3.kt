package com.example.modulo_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class board3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board3)

        window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        val btnProximo = findViewById<Button>(R.id.button)

        btnProximo.setOnClickListener {
            val intent = Intent(this,BoasVindas::class.java)
            startActivity(intent)
        }

        val btnPular = findViewById<Button>(R.id.button2)
        btnPular.setOnClickListener {
            val intent = Intent(this,BoasVindas::class.java)
            startActivity(intent)
        }

    }
}