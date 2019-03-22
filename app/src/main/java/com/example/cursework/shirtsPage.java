package com.example.cursework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.widget.CheckBox;

public class shirtsPage extends AppCompatActivity {
    CheckBox shirts1, shirts2, shirts3;

    @Override
    protected void onCreate(Bundle savesInstanceState){
        super.onCreate(savesInstanceState);
        setContentView(R.layout.shirts);
        shirts1 = (CheckBox)findViewById(R.id.checkBox);
        shirts2 = (CheckBox)findViewById(R.id.checkBox2);
        shirts3 = (CheckBox)findViewById(R.id.checkBox3);
        Button btn = (Button)findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Selected Item";
                if(shirts1.isChecked()){
                    result += "\nSlim fit";
                }
                if(shirts2.isChecked()){
                    result += "\nRegular fit";
                }
                if(shirts3.isChecked()){
                    result += "\nRegular fit";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                str = checked?"Slim fit shirts Selected":"Slime fit shirts Deselected";
                break;
            case R.id.checkBox2:
                str = checked?"Regular fit shirts Selected":"Regular fit shirts Deselected";
                break;
            case R.id.checkBox3:
                str = checked?" Regular fir shirts Selected":"Regular fit shirts Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

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
        Toast.makeText(this,"Add Item:" +item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.profile:
                // not available yet
                return true;
            case R.id.shopping_cart:
                startActivity(new Intent(shirtsPage.this, ShopCart.class));
                return true;
            case R.id.Upload_item:
                // not available yet
                return true;
            case R.id.Clothes:
                startActivity(new Intent(shirtsPage.this, mainPage.class));
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
