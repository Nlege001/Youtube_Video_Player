package com.example.youtubevideoplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment

//https://www.youtube.com/watch?v=Y0Dj-VCXE_o
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var youtubefragment = supportFragmentManager.findFragmentById(R.id.youtube_fragment) as YouTubePlayerSupportFragment

        youtubefragment.initialize("AIzaSyBinbHb4XnxtxkCRXTSL4DO0ccIsnr-FOc", object: YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider?,
                player: YouTubePlayer?,
                wasRestored: Boolean
            ) {
                if (player == null) return
                if(wasRestored)
                    player.play()
                else{
                    player.cueVideo("wWz--lUTl5k")
                    player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT)
                }
            }
Ω
            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
            }

        })
    }
}
