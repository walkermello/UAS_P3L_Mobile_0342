package com.example.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KaryawanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karyawan);
    }

    public void btnAset (View view) {
        startActivity(new Intent(KaryawanActivity.this, AsetActivity.class));
        finish();
    }

    public void btnLogout (View view) {
        startActivity(new Intent(KaryawanActivity.this, AsetActivity.class));
        finish();
    }
}