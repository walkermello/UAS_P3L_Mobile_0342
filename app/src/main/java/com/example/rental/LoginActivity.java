package com.example.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etPass;
    private MaterialButton btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText)findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);


    }

    public void checkLogin(View view) {
        if (etEmail.getText().toString().equals("luispeter84@gmail.com")) {
            startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
            finish();
        }
        else if(etEmail.getText().toString().equals("jakaa46@gmail.com")){
            startActivity(new Intent(LoginActivity.this, ProfileDriverActivity.class));
            finish();
        }
        else if(etEmail.getText().toString().equals("luispeter46@gmail.com")){
            startActivity(new Intent(LoginActivity.this, ReportActivity.class));
            finish();
        }
    }
}

