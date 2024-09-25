package com.example.videoview

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.VideoView
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    lateinit var videoview:VideoView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        videoview =findViewById(R.id.videoView)
        button =findViewById(R.id.button)

        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),111)
            }
        else
            {
                button.isEnabled=true
            }

        button.setOnClickListener {
            var intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivityForResult(intent, 101)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==101)
        {
            videoview.setVideoURI(data?.data)
            videoview.start()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 111 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            button.isEnabled = true
        }
    }
}