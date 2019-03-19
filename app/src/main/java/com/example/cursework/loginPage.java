package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_page);

        defineButtons();
    }

    public void defineButtons()
    {
        findViewById(R.id.login).setOnClickListener(buttonClickListener);
        findViewById(R.id.Register).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.login:
                    startActivity(new Intent(loginPage.this, mainPage.class));
                    break;
                case R.id.Register:
                    Intent intent = new Intent(loginPage.this, Registration.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}


