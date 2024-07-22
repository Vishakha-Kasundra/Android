package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var pb:ProgressBar=findViewById(R.id.progressBar2)
        var Count:Int=0
        Thread(Runnable {
            while (Count<=100)
            {
                Thread.sleep(5)
                Count++
                pb.setProgress(Count)
                pb.secondaryProgress=Count+10
            }
            if(Count>=100)
            {
                var i = Intent(this,SecondActivity::class.java)
                startActivity(i)
            }
        }).start()

    }
}