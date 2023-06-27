package com.example.web_page_inandroid

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.web_page_inandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindng: ActivityMainBinding
    lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindng = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindng.root)
        //... code app web view
        myWebView = bindng.webPage
        webViewSetUp()
    }// end on create

    private fun webViewSetUp() {
        bindng.webPage.webViewClient = WebViewClient()
        bindng.apply {
            myWebView.loadUrl("https://carbon.now.sh/?bg=rgba%2816%2C95%2C211%2C1%29&t=theme%3Ae7q4qqn9894&wt=none&l=auto&width=680&ds=true&dsyoff=20px&dsblur=68px&wc=true&wa=true&pv=56px&ph=56px&ln=false&fl=1&fm=Hack&fs=14px&lh=133%25&si=false&es=2x&wm=false&code=if%28%29%257B%250A%250A%257D")
            myWebView.settings.javaScriptEnabled = true
            myWebView.settings.domStorageEnabled = true
            myWebView.settings.loadWithOverviewMode = true
            myWebView.settings.useWideViewPort = true
        }
    }

    override fun onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }


}