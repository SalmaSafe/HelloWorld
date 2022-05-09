package com.example.hellosalma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI:Button
    lateinit var btnSend:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI = findViewById(R.id.btnBMI)
        btnBMI.setOnClickListener {
            val intent = Intent(this, BMICalculatorActivity::class.java)
            startActivity(intent)

            }

        btnSend=findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            val intent=Intent(this,MoneyTransfer::class.java)
            startActivity(intent)
        }
    }
}
