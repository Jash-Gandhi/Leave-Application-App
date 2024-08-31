package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        // Initialize the register button
        Button registerButton = findViewById(R.id.registerButton);

        // Set OnClickListener to the register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Login_Page activity
                Intent intent = new Intent(Register_Page.this, Login_Page.class);
                startActivity(intent);
            }
        });
    }
}
