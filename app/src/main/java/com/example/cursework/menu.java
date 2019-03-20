package com.example.cursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

//This menu class is basically for all the activity
//can choose which screen they want to move.


public class menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        setContentView(R.layout.shirts);
        setContentView(R.layout.polo);
        setContentView(R.layout.tshirts);
        setContentView(R.layout.jackets);
        setContentView(R.layout.jeans);
        setContentView(R.layout.joggers);
        setContentView(R.layout.shop_cart);
    }

    //Load Android option menu from an activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    //this use to handle a option menu item click events
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.profile:
                // do your code
                return true;
            case R.id.shopping_cart:
                startActivity(new Intent(menu.this, ShopCart.class));
                return true;
            case R.id.Upload_item:
                // do your code
                return true;
            case R.id.Clothes:
                startActivity(new Intent(menu.this, mainPage.class));
                return true;
            case R.id.notification:
                // do your code
                return true;
            case R.id.setting:
                // do your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
