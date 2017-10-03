package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    //Initialize the contents of the activity's options menu
    public boolean onCreateOptionMenu(Menu menu) {
        //show the menu
        getMenuInflater().inflate(R.menu.toppings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //handle menu items using their id
        switch (item.getItemId()){
            case R.id.meat:
                Toast.makeText("Meat", Toast.LENGTH_LONG).show();
                break;
            case R.id.hawaiian:
                Toast.makeText("Hawaiian", Toast.LENGTH_LONG).show();
                break;
            case R.id.veggie:
                Toast.makeText("Veggie", Toast.LENGTH_LONG).show();
                break;
            case R.id.mediterranean:
                Toast.makeText("Mediterranean", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
