package com.projects.anticovid_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.projects.anticovid_19.MythBusters.Myth_BusterActivity;
import com.projects.anticovid_19.Precautions.PecautionFragment_Activity;
import com.projects.anticovid_19.Statistics.WorldCases;
import com.projects.anticovid_19.Telephone.HelpLine;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView textView;
    Button btn_maps, btn_stats, btn_chat, btn_precautions, btn_riskLevel, btn_helpLine;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setItemBackground(null);
        toolbar = findViewById(R.id.toolbar);


        toolbar.setTitle("AntiCovid-19");


        // different icons
        btn_maps = findViewById(R.id.maps);
        btn_stats = findViewById(R.id.stats_btn);
        btn_chat = findViewById(R.id.ChatBot_btn);
        btn_precautions = findViewById(R.id.Precaution_btn);
        btn_riskLevel = findViewById(R.id.RiskLevel_btn);
        btn_helpLine = findViewById(R.id.helpline_btn);


        btn_precautions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inta = new Intent(MainActivity.this, PecautionFragment_Activity.class);
                startActivity(inta);
            }
        });


        btn_riskLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intb = new Intent(MainActivity.this, NewsActvity.class);
                startActivity(intb);
            }
        });

        btn_helpLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intc = new Intent(MainActivity.this, HelpLine.class);
                startActivity(intc);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intd = new Intent(MainActivity.this, ChatBotActvity.class);
                startActivity(intd);
            }
        });


        btn_stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(MainActivity.this, WorldCases.class);
                startActivity(intent10);
            }
        });


        btn_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intm = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intm);
            }
        });


        setSupportActionBar(toolbar);


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                break;

            case R.id.nav_stats:
                Intent intent10 = new Intent(MainActivity.this, WorldCases.class);
                startActivity(intent10);
                break;


            case R.id.nav_news:
                Intent intent11 = new Intent(MainActivity.this, NewsActvity.class);
                startActivity(intent11);
                break;


            case R.id.nav_risklevel:
                Intent intent12 = new Intent(MainActivity.this, RiskLevel.class);
                startActivity(intent12);
                break;




            case R.id.nav_myth:
                Intent intentmy = new Intent(MainActivity.this, Myth_BusterActivity.class);
                startActivity(intentmy);
                break;

            case R.id.nav_helpline:
                Intent intent15 = new Intent(MainActivity.this, HelpLine.class);
                startActivity(intent15);
                break;


                // MORE OPTIONS ---



            case R.id.nav_share:
                Intent  sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String sharebody = "CoviData";
                String shareSubject = "Download the AntiCovid --\nhttps://drive.google.com/open?id=1x-e9HgodVcUIWsS_cLDeCPYT0UGBdF5L";


                sharingIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
                sharingIntent.putExtra(Intent.EXTRA_TEXT,shareSubject);

                startActivity(Intent.createChooser(sharingIntent,"Sharing Using"));


                break;

            case R.id.nav_privacy:
                Intent intprivacy = new Intent (MainActivity.this,PrivacyActivty.class);
                startActivity(intprivacy);
                break;

            case R.id.nav_about:
                Intent intabout= new Intent (MainActivity.this,About.class);
                startActivity(intabout);
                break;



        }

        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }
}
