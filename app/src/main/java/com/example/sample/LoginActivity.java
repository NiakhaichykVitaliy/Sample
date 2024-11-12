package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    private EditText usernameInput;
    private EditText passwordInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        button = findViewById(R.id.login_btn);
        button.setOnClickListener(view -> {
            if (usernameInput.getText().length() == 0) {
                Toast toast = Toast.makeText(this, R.string.login_username_error, Toast.LENGTH_SHORT);
                toast.show();
            } else if (passwordInput.getText().length() == 0) {
                Toast toast = Toast.makeText(this, R.string.login_password_error, Toast.LENGTH_SHORT);
                toast.show();
            } else {
                MainActivity.intent(this);
                finish();
            }
        });
    }
}