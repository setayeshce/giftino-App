package com.example.giftino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText loginName;
    private TextInputEditText loginPhone;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btn_login.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this, main2.class);
            startActivity(i);

        });


    }
    protected void init() {
//        loginName = findViewById(R.id.login_name);
//        loginPhone = findViewById(R.id.login_phone);
        btn_login=findViewById(R.id.btn_login);

    }
}