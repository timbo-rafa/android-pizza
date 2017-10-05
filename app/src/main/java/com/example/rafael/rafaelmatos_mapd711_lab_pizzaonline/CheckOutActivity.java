package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CheckOutActivity extends AppCompatActivity {

    String flavour;
    String pizzaSize;
    String toppings;
    String[] customerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        Intent customerInfoActivity = getIntent();
        TextView checkOutText = (TextView) findViewById(R.id.checkOutText);

        //get all data collected from app
        flavour = customerInfoActivity.getStringExtra("flavour");
        pizzaSize = customerInfoActivity.getStringExtra("pizzaSize");
        toppings = customerInfoActivity.getStringExtra("toppings");
        customerData = customerInfoActivity.getStringArrayExtra("customerData");

        // set text with customer data
        checkOutText.setText(customerData[0] +  ", thank you for your online order. " +
            "Your " + pizzaSize + " " + flavour + " " + toppings +
            " order was successfully received and will be delivered to " +
            customerData[1] + " soon.");
    }
}
