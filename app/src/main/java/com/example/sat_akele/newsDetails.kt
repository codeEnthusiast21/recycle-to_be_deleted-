package com.example.sat_akele

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class newsDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)
        val heading = intent.getStringExtra("heading")
        val image = intent.getIntExtra("imageId",R.drawable.satp1)
        val newsContent = intent.getStringExtra("news_content")

        val headTv = findViewById<TextView>(R.id.newsHead)
        val ImageIv = findViewById<ImageView>(R.id.imgId)
        val newsC = findViewById<TextView>(R.id.newsContent)

        headTv.text = heading
        newsC.text = newsContent
        ImageIv.setImageResource(image)
    }
}