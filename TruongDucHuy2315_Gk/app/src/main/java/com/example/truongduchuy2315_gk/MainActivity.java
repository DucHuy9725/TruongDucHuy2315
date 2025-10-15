package com.example.truongduchuy2315_gk;

import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText edtTen2315, edtMsv2315, edtSdt2315, edtEmail2315;
        Button btnNhap2315;


        edtTen2315 = findViewById(R.id.edtTen);
        edtMsv2315 = findViewById(R.id.edtMsv);
        edtSdt2315 = findViewById(R.id.edtSdt);
        edtEmail2315 = findViewById(R.id.edtEmail);
        btnNhap2315 = findViewById(R.id.button);

        btnNhap2315.setOnClickListener(v->{
            String ten = edtTen2315.getText().toString();
            Intent intent = new Intent(MainActivity.this, trangphu.class);
            startActivities(intent);
        });

    }
}