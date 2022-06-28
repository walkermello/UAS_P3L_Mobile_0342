package com.example.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {



    private TextView tv_email,tv_nama, tv_noTelp, tv_alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv_email = findViewById(R.id.tv_email);
        tv_nama = findViewById(R.id.tv_nama);
        tv_noTelp = findViewById(R.id.tv_noTelp);
        tv_alamat = findViewById(R.id.tv_alamat);
    }


    public void btn_Back (View view) {
        startActivity(new Intent(ProfileActivity.this, LoginActivity.class));
        finish();
    }
}