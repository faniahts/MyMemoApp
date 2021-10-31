package com.example.mymemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageButton = (ImageButton) findViewById(R.id.btnSemuaTugas);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tugasSaya = new Intent(HomeActivity.this, com.example.mymemoapp.tugasSaya.class);
                startActivity(tugasSaya);
            }
        });
    }
}