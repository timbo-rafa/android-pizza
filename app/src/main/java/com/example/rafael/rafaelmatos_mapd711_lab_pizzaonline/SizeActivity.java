package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SizeActivity extends AppCompatActivity {

    String flavour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);
        Intent landingActivity = getIntent();

        // get flavour from previous Activity
        flavour = landingActivity.getStringExtra("flavour");

        // display flavour on screen
        TextView sizeQuestionText = (TextView) findViewById( R.id.sizeQuestionText );
        sizeQuestionText.setText("What size would you like for your " + flavour + " Pizza?");
    }
}
