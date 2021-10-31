package com.example.mymemoapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Android14Activity extends Activity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageButton = (ImageButton) findViewById(R.id.btn_pluss);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPlus = new Intent(Android14Activity.this, Android18Activity.class);
                startActivity(iPlus);
            }
        });
    }
}
