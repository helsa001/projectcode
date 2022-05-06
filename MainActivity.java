package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //connection to the about you page
    public void launchAboutYouPage(View v) {
        Intent About = new Intent(this, AboutPage.class);
        startActivity(About);

    }
    //connection to settings page
    public void launchSettings(View v){
        Intent Settings = new Intent(this, SettingsPage.class);
        startActivity(Settings);
    }
}