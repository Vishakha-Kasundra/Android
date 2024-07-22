package com.example.myproject

import android.os.Bundle
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixth)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var rat:RatingBar=findViewById(R.id.ratingBar)
        var txt:TextView=findViewById(R.id.textViewA)
//        var sb:SeekBar=findViewById(R.id.seekBar)
//        var txt2:TextView=findViewById(R.id.textViewB)

        rat.setOnRatingBarChangeListener { ratingBar, fl, b ->
            txt.setText("Rating is: $fl")
        }

//        sb.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
//
//        })
    }
}