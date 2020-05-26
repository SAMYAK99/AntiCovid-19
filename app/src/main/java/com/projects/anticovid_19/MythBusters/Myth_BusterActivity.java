package com.projects.anticovid_19.MythBusters;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.airbnb.lottie.LottieAnimationView;
import com.projects.anticovid_19.R;


public class Myth_BusterActivity extends AppCompatActivity {
     Button myth ;
    LottieAnimationView  mythanim ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth__buster);

        myth =  findViewById(R.id.myth_fragbtn);
        mythanim = findViewById(R.id.lottemyth);

        myth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myth.setVisibility(View.GONE);
                mythanim.setVisibility(View.GONE);
                FragmentManager fragmentManager = getSupportFragmentManager();
               MythBuster mp   = new MythBuster();

                fragmentManager.beginTransaction().replace(R.id.container, mp).commit();
            }
        });


    }
}
