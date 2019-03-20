package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class mainPage extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savesInstanceState){
        super.onCreate(savesInstanceState);
        setContentView(R.layout.main_page);

        defineButtons();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this,"Selected Item:" +item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.profile:
                // do your code
                return true;
            case R.id.shopping_cart:
                startActivity(new Intent(mainPage.this, ShopCart.class));
                return true;
            case R.id.Upload_item:
                // do your code
                return true;
            case R.id.Clothes:
                startActivity(new Intent(mainPage.this, mainPage.class));
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

    //define different image in different button
    public void defineButtons()
    {
        findViewById(R.id.button2).setOnClickListener(buttonClickListener);
        findViewById(R.id.button4).setOnClickListener(buttonClickListener);
        findViewById(R.id.button5).setOnClickListener(buttonClickListener);
        findViewById(R.id.button6).setOnClickListener(buttonClickListener);
        findViewById(R.id.button7).setOnClickListener(buttonClickListener);
        findViewById(R.id.button8).setOnClickListener(buttonClickListener);
    }

    //Switch statement for each image to different screen
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button2:
                    startActivity(new Intent(mainPage.this, shirtsPage.class));
                    break;
                case R.id.button4:
                    startActivity(new Intent(mainPage.this, poloPage.class));
                    break;
                case R.id.button5:
                    startActivity(new Intent(mainPage.this, tshirtsPage.class));
                    break;
                case R.id.button6:
                    startActivity(new Intent(mainPage.this, jacketsPage.class));
                    break;
                case R.id.button7:
                    startActivity(new Intent(mainPage.this, jeansPage.class));
                    break;
                case R.id.button8:
                    startActivity(new Intent(mainPage.this, joggersPage.class));
                    break;
            }
        }
    };
}
