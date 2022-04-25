package com.rana.getage_kotlin_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yearOfBirth = findViewById<EditText>(R.id.editText_YearOfBirth)
        val age = findViewById<TextView>(R.id.textView_Age)
        val calButton = findViewById<Button>(R.id.Button_Calculate)

        val yOB = yearOfBirth.editableText.toString()
        calButton.setOnClickListener{
            val age = 2022 - yOB.toInt()
        }
    }
}