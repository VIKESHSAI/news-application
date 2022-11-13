package com.example.bigbang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {
Toolbar toolbar;
WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        toolbar=findViewById(R.id.toolbar);
        WebView=findViewById(R.id.WebView);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl(url);




    }
}