package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SizeActivity extends AppCompatActivity {

    String flavour;
    String pizzaSize;

    RadioGroup radioGroup;
    RadioButton radSmall;
    RadioButton radMedium;
    RadioButton radLarge;
    RadioButton radExtraLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);
        Intent landingActivity = getIntent();

        //attach references to object
        radioGroup = (RadioGroup) findViewById(R.id.radSizeGroup);
        radSmall = (RadioButton) findViewById(R.id.radSmall);
        radMedium = (RadioButton) findViewById(R.id.radMedium);
        radLarge = (RadioButton) findViewById(R.id.radLarge);
        radExtraLarge = (RadioButton) findViewById(R.id.radExtraLarge);

        // get flavour from previous Activity
        flavour = landingActivity.getStringExtra("flavour");

        // display flavour on screen
        TextView sizeQuestionText = (TextView) findViewById( R.id.sizeQuestionText );
        sizeQuestionText.setText("What size would you like for your " + flavour + " Pizza?");

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (radSmall.isChecked()) {
                    pizzaSize = getString(R.string.small);
                } else if (radMedium.isChecked()) {
                    pizzaSize = getString(R.string.medium);
                } else if (radLarge.isChecked()) {
                    pizzaSize = getString(R.string.large);
                } else {
                    pizzaSize = getString(R.string.extraLarge);
                }
                Toast.makeText(SizeActivity.this, pizzaSize + " " + flavour + " selected!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
