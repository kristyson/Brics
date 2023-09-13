package com.example.modulo_d

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val events = findViewById<ImageView>(R.id.imageView4)
        events.setOnClickListener {
            val intent = Intent(this,Evento::class.java)
            startActivity(intent)
        }
    }
}