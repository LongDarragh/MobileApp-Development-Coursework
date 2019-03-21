package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class jeansPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savesInstanceState){
        super.onCreate(savesInstanceState);
        setContentView(R.layout.jeans);
    }

    //Load Android option menu from an activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    //this use to handle a option menu item click events
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this,"Selected Item:" +item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.profile:
                // not available yet
                return true;
            case R.id.shopping_cart:
                startActivity(new Intent(jeansPage.this, ShopCart.class));
                return true;
            case R.id.Upload_item:
                // not available yet
                return true;
            case R.id.Clothes:
                startActivity(new Intent(jeansPage.this, mainPage.class));
                return true;
            case R.id.notification:
                // not available yet
                return true;
            case R.id.setting:
                // not available yet
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
