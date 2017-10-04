package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ToppingsActivity extends AppCompatActivity {

    String flavour;
    String pizzaSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings);

        Intent sizeActivity = getIntent();

        // get flavour from previous Activity
        flavour = sizeActivity.getStringExtra("flavour");
        pizzaSize = sizeActivity.getStringExtra("pizzaSize");

        CheckBox cheeseCheckBox        = (CheckBox) findViewById(R.id.cheeseCheckBox);
        CheckBox greenPepperCheckBox   = (CheckBox) findViewById(R.id.greenPepperCheckBox);
        CheckBox smokedHamCheckBox     = (CheckBox) findViewById(R.id.smokedHamCheckBox);
        final CheckBox spinachCheckBox       = (CheckBox) findViewById(R.id.spinachCheckBox);
        CheckBox spanishOnionsCheckBox = (CheckBox) findViewById(R.id.spanishOnionsCheckBox);

        // display flavour on screen
        TextView toppingsQuestionText = (TextView) findViewById( R.id.toppingsQuestionText );
        toppingsQuestionText.setText("Would you like toppings for your " + pizzaSize + " " + flavour + " Pizza?");

        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
