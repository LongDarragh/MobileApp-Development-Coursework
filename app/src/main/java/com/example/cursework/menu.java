package com.example.cursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
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
