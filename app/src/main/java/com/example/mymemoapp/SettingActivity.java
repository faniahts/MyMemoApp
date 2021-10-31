package com.example.mymemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //inisial tombol
        Button btnProfileActivity = findViewById(R.id.btn_Profil);
        Button btnLanguageActivity = findViewById(R.id.btn_Bahasa);
        Button btnLogOutActivity = findViewById(R.id.btn_LogOut);

        // function tombol
        btnProfileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iProfile = new Intent (SettingActivity.this, ProfileActivity.class);
                startActivity(iProfile);
            }
        });

        btnLanguageActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLanguage = new Intent (SettingActivity.this, LanguageActivity.class);
                startActivity(iLanguage);
            }
        });

        btnLogOutActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogOut = new Intent (SettingActivity.this, MainActivity.class);
                startActivity(iLogOut);
            }
        });

    }
}