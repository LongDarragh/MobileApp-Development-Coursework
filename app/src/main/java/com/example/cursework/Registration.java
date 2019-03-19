package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.registration);

        View saveData = findViewById(R.id.);
        saveData.setOnClickListener(this);
        View checkData = findViewById(R.id.);
        checkData.setOnClickListener(this);

    }

    public void LOGIN(View view) {
        Intent intent = new Intent(Registration.this, mainPage.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnsave:
                Intent i = new Intent(this, AddData.class);
                startActivity(i);
                break;
            case R.id.btnLogin:
                Intent intent = new Intent(Registration.this, mainPage.class);
                startActivity(intent);
                break;
        }

    }
}

