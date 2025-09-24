package com.example.adrhuy2315;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    TextView tvProfileName315, tvScore1315, tvScore2315, tvEmail315, tvPhone315, tvSkype315, tvWeb315;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvProfileName315 = findViewById(R.id.tvProfileName315);
        tvScore1315 = findViewById(R.id.tvScore1315);
        tvScore2315 = findViewById(R.id.tvScore2315);
        tvEmail315 = findViewById(R.id.tvEmail315);
        tvPhone315 = findViewById(R.id.tvPhone315);
        tvSkype315 = findViewById(R.id.tvSkype315);
        tvWeb315 = findViewById(R.id.tvWeb315);

        // Set dữ liệu demo
        tvProfileName315.setText("Trương Đức Huy");
    }
}
