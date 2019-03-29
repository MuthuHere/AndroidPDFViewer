package com.muthu.pdfview

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebSettings
import android.webkit.WebView

@SuppressLint("SetJavaScriptEnabled")
class PDFViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mWebView = WebView(this@PDFViewActivity)
        mWebView.settings.javaScriptEnabled = true
        mWebView.settings.pluginState = WebSettings.PluginState.ON


        mWebView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "http://www.africau.edu/images/default/sample.pdf")
        setContentView(mWebView)

    }


}


