package com.example.laba3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField = findViewById<EditText>(R.id.inputField)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        checkButton.setOnClickListener {
            val input = inputField.text.toString()

            var result = ""
            var sum = 0
            for (char in input) {
                if (char.isDigit()) {
                    result += " "
                }
                else if (char.isLowerCase()){
                    sum += 1
                    result += char
                }
                else result += char
            }
            resultText.text = "$result \n количество латинских строчных букв = $sum"
        }
    }
}