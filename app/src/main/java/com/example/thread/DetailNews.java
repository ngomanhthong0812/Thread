package com.example.thread;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class DetailNews extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);
        webView = (WebView) findViewById(R.id.webViewDetailNews);

        Intent intent = getIntent();
        String link = intent.getStringExtra("link");

        webView.loadUrl(link);
        webView.setWebViewClient(new WebViewClient());

    }
}