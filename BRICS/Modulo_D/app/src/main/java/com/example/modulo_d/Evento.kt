package com.example.modulo_d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Evento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evento)

        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

    }
}