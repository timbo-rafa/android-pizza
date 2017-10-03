package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.speed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //handle menu items using their id
        switch (item.getItemId()){
            case R.id.m1:
                Toast.makeText("You selected option 1!").show();
                break;
            case R.id.m2:
                break;
            case R.id.m3:
                break;
            case R.id.m4:
                break;
        }
    }
}
