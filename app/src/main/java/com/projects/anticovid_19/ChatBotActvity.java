package com.projects.anticovid_19;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class

ChatBotActvity extends AppCompatActivity {

    WebView webView1  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot_actvity);


        webView1 = findViewById(R.id.ChatBot_web);

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());

        webView1.loadUrl("https://covid.apollo247.com/?utm_source=linkedin&utm_medium=organic&utm_campaign=bot_scanner");
       // webView1.loadUrl("https://bot.dialogflow.com/08d19dc7-1470-4cbf-ba15-8242e4732e5f");


    }


}
