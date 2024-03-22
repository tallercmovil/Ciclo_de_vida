package com.amaurypm.ciclodevida

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("LOGS", "onCreate()")

        mediaPlayer = MediaPlayer.create(this, R.raw.zeldatok)


    }

    override fun onStart() {
        super.onStart()
        Log.d("LOGS", "onStart()")
        mediaPlayer.start()
    }

    override fun onResume() {
        super.onResume()
        Log.d("LOGS", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LOGS", "onPause()")
        mediaPlayer.pause()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LOGS", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LOGS", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LOGS", "onRestart()")
        mediaPlayer.start()
    }
}