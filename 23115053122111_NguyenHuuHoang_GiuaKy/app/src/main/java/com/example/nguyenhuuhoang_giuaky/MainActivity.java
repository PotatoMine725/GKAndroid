package com.example.nguyenhuuhoang_giuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail, edtPassword;

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener( v1 -> {
            String Username = edtEmail.getText().toString();
            String Password = edtPassword.getText().toString();

            Intent intent = new Intent(MainActivity.this, Subactivity.class);
            intent.putExtra("Email", Username);
            intent.putExtra("Password", Password);
            startActivity(intent);
        });
    }
}