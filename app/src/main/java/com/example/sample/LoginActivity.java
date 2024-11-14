package com.example.sample;

import android.os.Bundle;
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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        button = findViewById(R.id.login_btn);
        button.setOnClickListener(view -> {
            final boolean isUsernameEmpty = usernameInput.getText().toString().isEmpty();
            final boolean isPasswordEmpty = passwordInput.getText().toString().isEmpty();
            if (!isUsernameEmpty && !isPasswordEmpty) {
                MainActivity.startMainActivity(this);
                finish();
            } else {
                final int errorRes = isUsernameEmpty ? R.string.login_username_error : R.string.login_password_error;
                Toast.makeText(this, errorRes, Toast.LENGTH_SHORT).show();
            }
        });
    }
}