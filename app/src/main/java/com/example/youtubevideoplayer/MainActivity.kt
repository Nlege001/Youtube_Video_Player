package com.example.youtubevideoplayer


import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.*


class MainActivity : AppCompatActivity() {

    var videoView: VideoView ?= null

    var mediaController: MediaController?=  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        videoView = findViewById<View>(R.id.videoView) as VideoView?


        if(mediaController == null){
            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)

        }
        videoView!!.setMediaController(mediaController)

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.video))

        videoView!!.requestFocus()

        videoView!!.start()

        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, " Video End", Toast.LENGTH_LONG).show()
        }





    }
}
