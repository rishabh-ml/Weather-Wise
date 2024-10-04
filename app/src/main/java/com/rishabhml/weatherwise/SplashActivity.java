package com.rishabhml.weatherwise;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Optional: If you have a layout for SplashActivity
        // setContentView(R.layout.activity_splash);

        // Start MainActivity after a delay or initialization
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish(); // Close SplashActivity
    }
}
