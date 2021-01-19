package com.am.mybtnlisner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity3 extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        webView=findViewById(R.id.w);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://techmanifester.com/");
    }
}