package com.example.youtubevideoplayer


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.youtube.player.*

//https://www.youtube.com/watch?v=L0WGZSiOZsM
class MainActivity : YouTubeBaseActivity() {
    lateinit var VIDEO_ID : String
    val YOUTUBE_API_KEY = "AIzaSyC3_hVuOhAxz2WFLQ3UMHidn-6El40lGzo"

    lateinit var youtubePlayer: YouTubePlayerView
    lateinit var btnPlay: Button

    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VIDEO_ID = findViewById(R.id.TextInputEdit)
        youtubePlayer = findViewById(R.id.youtubePlayer)
        btnPlay = findViewById(R.id.btnPlay)

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID)


            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT ).show()

            }

        }

        btnPlay.setOnClickListener {
            youtubePlayer.initialize(YOUTUBE_API_KEY, youtubePlayerInit)
        }


    }
}
