package com.projects.anticovid_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    ImageView  git , linkdin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        git = findViewById(R.id.git);
        linkdin = findViewById(R.id.linkdin);


        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intgit =  new Intent(About.this,Github.class);
                startActivity(intgit);
            }
        });

        linkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intlink =  new Intent(About.this,Linkdin.class);
                startActivity(intlink);
            }
        });
    }
}
