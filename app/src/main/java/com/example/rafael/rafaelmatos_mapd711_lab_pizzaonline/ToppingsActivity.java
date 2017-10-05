package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ToppingsActivity extends AppCompatActivity {

    String flavour;
    String pizzaSize;
    String toppings;

    CheckBox cheeseCheckBox;
    CheckBox greenPepperCheckBox;
    CheckBox smokedHamCheckBox;
    CheckBox spinachCheckBox;
    CheckBox spanishOnionsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toppings);

        Intent sizeActivity = getIntent();

        // get flavour from previous Activity
        flavour = sizeActivity.getStringExtra("flavour");
        pizzaSize = sizeActivity.getStringExtra("pizzaSize");

        // associate references with objects
        cheeseCheckBox        = (CheckBox) findViewById(R.id.cheeseCheckBox);
        greenPepperCheckBox   = (CheckBox) findViewById(R.id.greenPepperCheckBox);
        smokedHamCheckBox     = (CheckBox) findViewById(R.id.smokedHamCheckBox);
        spinachCheckBox       = (CheckBox) findViewById(R.id.spinachCheckBox);
        spanishOnionsCheckBox = (CheckBox) findViewById(R.id.spanishOnionsCheckBox);

        // display flavour on screen
        TextView toppingsQuestionText = (TextView) findViewById( R.id.toppingsQuestionText );
        toppingsQuestionText.setText("Would you like toppings for your " + pizzaSize + " " + flavour + " Pizza?");

        Button nextButton = (Button) findViewById(R.id.nextButton);
        //Capture selected toppings on button press
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent customerInfoActivity = new Intent(ToppingsActivity.this, CustomerInfoActivity.class);

                toppings = "pizza with ";
                if (cheeseCheckBox.isChecked())        toppings += getString( R.string.cheese        ) + ", ";
                if (greenPepperCheckBox.isChecked())   toppings += getString( R.string.greenPepper   ) + ", ";
                if (smokedHamCheckBox.isChecked())     toppings += getString( R.string.smokedHam     ) + ", ";
                if (spinachCheckBox.isChecked())       toppings += getString( R.string.spinach       ) + ", ";
                if (spanishOnionsCheckBox.isChecked()) toppings += getString( R.string.spanishOnions ) + ", ";

                int idx = toppings.lastIndexOf(",");
                if (idx != -1) {
                    //replace last comma with period
                    toppings = new StringBuilder(toppings).replace(idx, idx + 2, "").toString();
                } else { //No toppings
                    toppings += getString(R.string.none);
                }

                //feedback data on screen
                Toast.makeText(ToppingsActivity.this,
                        pizzaSize + " " + flavour + " " + toppings + " selected!" , Toast.LENGTH_SHORT).show();
                customerInfoActivity.putExtra("flavour", flavour);
                customerInfoActivity.putExtra("pizzaSize", pizzaSize);
                customerInfoActivity.putExtra("toppings", toppings);
                startActivity(customerInfoActivity);
            }
        });
    }
}
