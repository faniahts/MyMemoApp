package com.example.mymemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        //inisial tombol
        ImageButton btnSave1 = findViewById(R.id.btn_save1);

        //function tombol
        btnSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSave1 = new Intent(ReminderActivity.this, Android26Activity.class);
                startActivity(iSave1);
            }
        });
    }
}