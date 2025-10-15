package com.example.nguyenhuuhoang_giuaky;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Subactivity extends AppCompatActivity {
    Button btnMain;
    TextView txtEmail, txtPass;

    @Override
    protected void onCreate (Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        EdgeToEdge.enable(this);
        setContentView(R.layout.subactivity);

        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPass);
        btnMain = findViewById(R.id.btnMain);

        String name = getIntent().getStringExtra("Email");
        String pass = getIntent().getStringExtra("Password");
        txtEmail.setText(name);
        txtPass.setText(pass);

        btnMain.setOnClickListener(v1 -> {
            finish();
        });
    }
}
