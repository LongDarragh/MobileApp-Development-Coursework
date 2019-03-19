package com.example.cursework;

import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity implements View.OnClickListener {
    private Database dm;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.registration);

        View saveData = findViewById(R.id.btnsave);
        saveData.setOnClickListener(this);
        View back = findViewById(R.id.btnBack);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBack:
                Intent intent = new Intent(Registration.this, loginPage.class);
                startActivity(intent);
                break;
            case R.id.btnsave:
                String name = ((EditText) findViewById(R.id.txtName)).getText().toString();
                String email = ((EditText) findViewById(R.id.txtEmail)).getText().toString();
                String password = ((EditText) findViewById(R.id.txtPwd)).getText().toString();
                this.dm = new Database(this);
                this.dm.insert(name, email, password);
                break;
        }
    }
}