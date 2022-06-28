package com.example.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
    }

    public void btnProfile (View view) {
        startActivity(new Intent(DriverActivity.this, ProfileDriverActivity.class));
        finish();
    }

    /*public void btnHistory (View view) {
        startActivity(new Intent(DriverActivity.this, HistoryDriverActivity.class));
        finish();
    }*/

    public void btnLogout (View view) {
        startActivity(new Intent(DriverActivity.this, LoginActivity.class));
        finish();
    }
}