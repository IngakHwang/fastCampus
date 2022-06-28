package com.example.android.aop_part2_chapter01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText: EditText = findViewById(R.id.heightEditText)
        val weightEditText = findViewById<EditText>(R.id.weightEditText)
        val resultButton: Button = findViewById(R.id.resultButton)

        resultButton.setOnClickListener {

            if (heightEditText.text.isEmpty() || weightEditText.text.isEmpty()){
                Toast.makeText(this, "it is Empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val height = heightEditText.text.toString().toInt()
            val weight = weightEditText.text.toString().toInt()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("height",height)
            intent.putExtra("weight",weight)

            startActivity(intent)
        }
    }
}