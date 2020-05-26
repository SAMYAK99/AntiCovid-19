package com.projects.anticovid_19;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Linkdin extends AppCompatActivity {


    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkdin);

        webView = findViewById(R.id.linkdinweb);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.linkedin.com/in/samyak-singh-007abc/");
    }
}
