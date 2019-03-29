package com.muthu.pdfview;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class PDF extends AppCompatActivity {
    WebView webView;
    ProgressDialog pDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView mWebView = new WebView(PDF.this);
        mWebView.getSettings().setJavaScriptEnabled(true);
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR2) {
//            mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        }

        mWebView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + "https://crs.medallcorp.in/crs/DownloadReports/MOL1007117_sample.pdf");
        setContentView(mWebView);

    }


}


