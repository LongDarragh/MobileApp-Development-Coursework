package com.example.cursework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//A button which go to the loginPage
    public void WelcomeTradeApp(View view) {

        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }
}