package com.example.cursework;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savesInstanceState){
        super.onCreate(savesInstanceState);
        setContentView(R.layout.success);
    }


    public void Success(View view) {
        Intent intent = new Intent(Success.this, mainPage.class);
        startActivity(intent);
    }
}
