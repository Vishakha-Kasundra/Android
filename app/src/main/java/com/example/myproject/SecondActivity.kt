package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btn1:ImageButton=findViewById(R.id.imageButton1)
        var btn2:ImageButton=findViewById(R.id.imageButton2)
        var btn3:ImageButton=findViewById(R.id.imageButton3)
        var btn4:ImageButton=findViewById(R.id.imageButton4)
        btn1.setOnClickListener {
            var BTN1=Intent(this,ThirdActivity::class.java)
            startActivity(BTN1)
        }
        btn2.setOnClickListener {
            var BTN2=Intent(this,FourthActivity::class.java)
            startActivity(BTN2)
        }
        btn3.setOnClickListener {
            var BTN3=Intent(this,FormActivity::class.java)
            startActivity(BTN3)
        }
        btn4.setOnClickListener {
            var BTN4=Intent(this,SixthActivity::class.java)
            startActivity(BTN4)
        }
    }
}