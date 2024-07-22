package com.example.myproject

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(this, "Simple Button Clicked", Toast.LENGTH_LONG).show()
        }
        var imgbtn:ImageButton=findViewById(R.id.imageButton)
        imgbtn.setOnClickListener{
            Toast.makeText(applicationContext,"Image Button",Toast.LENGTH_LONG).show()
        }
        var img:ImageView=findViewById(R.id.imageView)
        var tg:ToggleButton=findViewById(R.id.toggleButton)
        tg.setOnClickListener {
            if (tg.text.equals("OFF"))
            {
                img.setImageResource(R.drawable.off)
            }
            else
            {
                img.setImageResource(R.drawable.on)
            }
        }

        var fg:FloatingActionButton=findViewById(R.id.floatingActionButton)
        fg.setOnClickListener {
            Toast.makeText(applicationContext,"Add Data From Here",Toast.LENGTH_LONG).show()
        }
    }
}