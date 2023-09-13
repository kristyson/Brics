package com.example.modulo_c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat

class board3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board3)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,login::class.java)
            startActivity(intent)
        }


        window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        val indicator1 = findViewById<ImageView>(R.id.indicator1)
        val indicator2 = findViewById<ImageView>(R.id.indicator2)
        val indicator3 = findViewById<ImageView>(R.id.indicator3)

        indicator1.setOnClickListener {
            updateIndicators(indicator1, indicator2, indicator3)
            val intent = Intent(this,board3::class.java)
            startActivity(intent)
            finish()
        }

        indicator2.setOnClickListener {
            updateIndicators(indicator2, indicator1, indicator3)
            val intent = Intent(this,board2::class.java)
            startActivity(intent)
            finish()
        }

        indicator3.setOnClickListener {
            updateIndicators(indicator3, indicator1, indicator2)
            val intent = Intent(this,board1::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun updateIndicators(selected: ImageView, vararg others: ImageView) {
        selected.setImageResource(R.drawable.bg_circle_yellow)
        others.forEach { it.setImageResource(R.drawable.bg_circle_vazio) }
    }




}
