package com.projects.anticovid_19;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.projects.anticovid_19.AppIntro.IntroActivity;

public class SplashScreen extends AppCompatActivity {

    private final static String TAG = "SPLASH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));
                finish();
            }
        }, 3000);

    }
}
