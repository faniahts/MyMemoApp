package com.example.mymemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        Button btnGoogleActivity = findViewById(R.id.btn_google);
        Button btnPhoneActivity = findViewById(R.id.btn_phone);

        // function tombol
        btnGoogleActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGoogle = new Intent(MainActivity.this, GoogleActivity.class);
                startActivity(iGoogle);

            }
        });
        btnPhoneActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPhone = new Intent(MainActivity.this, PhoneActivity.class);
                startActivity(iPhone);
            }
        });


    }
}

