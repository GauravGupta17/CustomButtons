package com.example.designtoolkit001

import android.content.Context
import android.os.Bundle
import android.view.View
import android.webkit.HttpAuthHandler
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity(){
    val url ="https://developer.android.com/guide/webapps/webview#kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        webView.loadUrl(url)

         webView.webViewClient = object : WebViewClient(){

             override fun onPageFinished(view: WebView?, url: String?) {
                 super.onPageFinished(view, url)
                   progressBar.makeVisible(false)

             }

             override fun shouldOverrideUrlLoading(
                 view: WebView?,
                 request: WebResourceRequest?
             ): Boolean {

                 if (url != request.toString()){
                     return true
                 }

               return false
                  }




         }
    }

    fun View.makeVisible(show:Boolean,gone:Boolean= false){

        this.visibility = when {
            show -> View.VISIBLE
            gone -> View.GONE
            else -> View.INVISIBLE
        }
    }






}