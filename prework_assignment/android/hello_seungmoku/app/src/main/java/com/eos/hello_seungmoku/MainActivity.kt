package com.eos.hello_seungmoku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgView = findViewById<ImageView>(R.id.iv)
        imgView.load(R.drawable.myname)
    }
}