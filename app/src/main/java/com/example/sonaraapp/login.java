package com.example.sonaraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
Button signup,login;
EditText et_pass,et_mobno_login;
Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.btn_login);

        et_mobno_login = findViewById(R.id.et_mobno_login);
        et_pass = findViewById(R.id.et_pass);
        signup = findViewById(R.id.btn_lgn_signup);
        signup.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(login.this,signup.class);
                startActivity(in);
            }
        }));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(login.this,choosebutton.class);
                startActivity(in);

            }
        });
    }


}