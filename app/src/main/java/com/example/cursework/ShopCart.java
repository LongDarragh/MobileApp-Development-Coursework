package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ShopCart extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.shop_cart);
    }

    public void CheckOut(View view) {
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }


}
