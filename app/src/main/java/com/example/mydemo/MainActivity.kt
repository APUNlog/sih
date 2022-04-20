package com.example.mydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button6 : Button = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
                val i = Intent(this,SecondActivity::class.java)
                startActivity(i)
        }

    }
}
