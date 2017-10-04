package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        //show the menu
        getMenuInflater().inflate(R.menu.flavours, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent sizeActivity = new Intent(this, SizeActivity.class);
        String flavour;
        //handle menu items  using their id
        switch (item.getItemId()){
            case R.id.meat:
                flavour = getString( R.string.meat );
                break;
            case R.id.hawaiian:
                flavour = getString( R.string.hawaiian );
                break;
            case R.id.veggie:
                flavour = getString( R.string.veggie );
                break;
            case R.id.mediterranean:
                flavour = getString( R.string.mediterranean );
                break;
            default:
                flavour = "Unknown flavour selected";
                break;
        }
        sizeActivity.putExtra("flavour", flavour);
        Toast.makeText(this, flavour + "pizza selected!", Toast.LENGTH_SHORT).show();

        //Start SizeActivity, passing the chosen pizza flavour
        startActivity(sizeActivity);
        return true;
    }
}
