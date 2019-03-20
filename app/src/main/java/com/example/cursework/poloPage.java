package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class poloPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savesInstanceState){
        super.onCreate(savesInstanceState);
        setContentView(R.layout.polo);
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
                // do your code
                return true;
            case R.id.shopping_cart:
                startActivity(new Intent(poloPage.this, ShopCart.class));
                return true;
            case R.id.Upload_item:
                // do your code
                return true;
            case R.id.Clothes:
                startActivity(new Intent(poloPage.this, mainPage.class));
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
