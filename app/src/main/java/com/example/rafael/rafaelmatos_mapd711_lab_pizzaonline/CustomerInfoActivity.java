package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CustomerInfoActivity extends AppCompatActivity {

    String flavour;
    String pizzaSize;
    String toppings;

    EditText customerNameEditText;
    EditText customerAddressEditText;
    EditText customerZipEditText;
    EditText customerPhoneEditText;
    EditText customerCardEditText;
    EditText customerCardExpiryDateEditText;
    String[] customerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
        Intent toppingsActivity = getIntent();

        // pizza specifications
        flavour = toppingsActivity.getStringExtra("flavour");
        pizzaSize = toppingsActivity.getStringExtra("pizzaSize");
        toppings = toppingsActivity.getStringExtra("toppings");

        //Text input
        customerNameEditText = (EditText) findViewById(R.id.customerNameInput);
        customerAddressEditText = (EditText) findViewById(R.id.customerAddressInput);
        customerZipEditText = (EditText) findViewById(R.id.customerZipCodeInput);
        customerPhoneEditText = (EditText) findViewById(R.id.customerPhoneInput);
        customerCardEditText = (EditText) findViewById(R.id.customerCardInput);
        customerCardExpiryDateEditText = (EditText) findViewById(R.id.customerCardExpiryDateInput);

        Button orderButton = (Button) findViewById(R.id.orderButton);

        //Get customer data on button press
        orderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent checkOutActivity = new Intent(CustomerInfoActivity.this, CheckOutActivity.class);

                //customer data
                customerData = new String[]{
                        customerNameEditText.getText().toString(),
                        customerAddressEditText.getText().toString(),
                        customerZipEditText.getText().toString(),
                        customerPhoneEditText.getText().toString(),
                        customerCardEditText.getText().toString(),
                        customerCardExpiryDateEditText.getText().toString()
                };

                //pass data to next activity
                //Toast.makeText(ToppingsActivity.this, pizzaSize + " " + flavour + " " + toppings, Toast.LENGTH_SHORT).show();
                checkOutActivity.putExtra("flavour", flavour);
                checkOutActivity.putExtra("pizzaSize", pizzaSize);
                checkOutActivity.putExtra("toppings", toppings);
                checkOutActivity.putExtra("customerData", customerData);
                startActivity(checkOutActivity);
            }
        });

    }
}
