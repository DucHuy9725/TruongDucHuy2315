package com.example.miniproject;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile); // trỏ tới file profile.xml của bạn
        ImageView IMGV = findViewById(R.id.imageView2);
        IMGV.setOnClickListener(v-> {
            Intent intent = new Intent(Profile.this, MainActivity.class );
            startActivity(intent);
        });
    }

}

