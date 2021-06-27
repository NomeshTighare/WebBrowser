package com.example.webbrowser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var mywebview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mywebview: WebView = findViewById(R.id.mywebview)
        val etURL: EditText = findViewById(R.id.eturl)
        val btnGo: ImageButton = findViewById(R.id.btngo)
        val btnhome: ImageButton = findViewById(R.id.btnhome)
        val btnlinkdin: ImageButton = findViewById(R.id.btnlink)
        val btnfacebook: ImageButton = findViewById(R.id.btnfb)
        val btninstagram: ImageButton = findViewById(R.id.btninsta)
        val btntwitter: ImageButton = findViewById(R.id.btntwit)
        val btngithub: ImageButton = findViewById(R.id.btngit)
        val btnmenu:ImageButton = findViewById(R.id.btnmenu)

        mywebview.webViewClient = WebViewClient()
        btnGo.setOnClickListener {
            val siteurl: String = etURL.text.toString()
            if (URLUtil.isValidUrl(siteurl))
            {
                mywebview.loadUrl(siteurl)
            }
            else
            {
                mywebview.loadUrl("https://www.google.com/search?q=$siteurl")
            }
        }
        btnhome.setOnClickListener(){
            mywebview.loadUrl("https://www.google.co.in")
        }
        btnfacebook.setOnClickListener(){
            mywebview.loadUrl("https://m.facebook.com/Nomu04/")
        }
        btninstagram.setOnClickListener(){
            mywebview.loadUrl("https://www.instagram.com/n_o_m_u_04/?r=nametag")
        }
        btntwitter.setOnClickListener(){
            mywebview.loadUrl("https://twitter.com/?lang=en")
        }
        btngithub.setOnClickListener(){
            mywebview.loadUrl("https://github.com/")
        }
        btnlinkdin.setOnClickListener(){
            mywebview.loadUrl("https://in.linkedin.com/")
        }
        btnmenu.setOnClickListener(){
            mywebview.loadUrl("file:///android_asset/QuickBuy.html")
        }
        mywebview.settings.javaScriptEnabled = true
    }
    override fun onBackPressed()
    {

        if (mywebview.canGoBack())
        {
            mywebview.goBack()
        }
        else
        {
            super.onBackPressed()
        }
    }

}