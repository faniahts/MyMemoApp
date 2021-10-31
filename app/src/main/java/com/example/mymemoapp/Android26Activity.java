package com.example.mymemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Android26Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android26);

        //inisial tombol
        ImageButton btnReminderActivity = findViewById(R.id.btn_reminder);
        ImageButton btnNotesActivity = findViewById(R.id.btn_notes);
        ImageButton btnAttachmentActivity = findViewById(R.id.btn_attachment);
        ImageButton btnFinishActivity = findViewById(R.id.btn_finish);

        //function tombol
        btnReminderActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iReminder = new Intent(Android26Activity.this, ReminderActivity.class);
                startActivity(iReminder);
            }
        });

        btnNotesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNotes = new Intent(Android26Activity.this, NotesActivity.class);
                startActivity(iNotes);
            }
        });

        btnAttachmentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAttachment = new Intent(Android26Activity.this, AttachmentActivity.class);
                startActivity(iAttachment);
            }
        });

        btnFinishActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iFinish = new Intent(Android26Activity.this, Android14Activity.class);
                startActivity(iFinish);
            }
        });
    }
}