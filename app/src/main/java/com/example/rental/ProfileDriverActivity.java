package com.example.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileDriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_driver);
    }

    public void btn_Back (View view) {
        startActivity(new Intent(ProfileDriverActivity.this, LoginActivity.class));
        finish();
    }
}