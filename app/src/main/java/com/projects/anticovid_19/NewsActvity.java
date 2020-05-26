package com.projects.anticovid_19;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.projects.anticovid_19.News.NewsFragment;


public class NewsActvity extends AppCompatActivity {


    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_actvity);
            btn = findViewById(R.id.GetNews);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setVisibility(View.GONE);
                FragmentManager fragmentManager = getSupportFragmentManager();
                NewsFragment indiaFrag = new NewsFragment();

                fragmentManager.beginTransaction().replace(R.id.container, indiaFrag).commit();

            }
        });
    }
}