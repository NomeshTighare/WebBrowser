package com.example.webbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton

class home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val mywebview: WebView = findViewById(R.id.mywebview)
        val btnlinkdin: ImageButton = findViewById(R.id.btnlinkdin)
        val btnyoutube: ImageButton = findViewById(R.id.btnyoutube)

        mywebview.webViewClient = WebViewClient()
        btnlinkdin.setOnClickListener {
            mywebview.loadUrl("https://in.linkedin.com/")
            }
        btnyoutube.setOnClickListener {
            mywebview.loadUrl("https://www.youtube.com/")
        }

        }


    }