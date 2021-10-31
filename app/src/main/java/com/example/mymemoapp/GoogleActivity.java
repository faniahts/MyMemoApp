package com.example.mymemoapp;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class GoogleActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        imageButton = (ImageButton) findViewById(R.id.imgbtn_profil);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleActivity = new Intent(GoogleActivity.this, HomeActivity.class);
                startActivity(googleActivity);
            }
        });

    }
}
