package com.example.adrhuy2315;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtUserName315, edtPassword315;
    Button btnLogin315;
    TextView tvForgotPassword315;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName315 = findViewById(R.id.edtUserName315);
        edtPassword315 = findViewById(R.id.edtPassword315);
        btnLogin315 = findViewById(R.id.btnLogin315);
        tvForgotPassword315 = findViewById(R.id.tvForgotPassword315);

        btnLogin315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user315 = edtUserName315.getText().toString();
                String pass315 = edtPassword315.getText().toString();

                if(user315.equals("admin") && pass315.equals("123")) {
                    Intent intent315 = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(intent315);
                } else {
                    edtPassword315.setError("Sai tài khoản hoặc mật khẩu!");
                }
            }
        });
    }
}
