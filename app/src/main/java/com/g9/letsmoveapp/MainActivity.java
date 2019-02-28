package com.g9.letsmoveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivityMyRides(View view) {
        Log.d(LOG_TAG, "MyRides Activity started!!");
        Intent intent = new Intent(this, MyRides.class);
        startActivity(intent);
    }

    public void startActivityNewRides(View view) {
        Log.d(LOG_TAG, "NewRides Activity started!!");
        Intent intent = new Intent(this, NewRide.class);
        startActivity(intent);
    }

    public void startActivityProfile(View view) {
        Log.d(LOG_TAG, "Profile Activity started!!");
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
