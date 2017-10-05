package com.example.rafael.rafaelmatos_mapd711_lab_pizzaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CustomerInfoActivity extends AppCompatActivity {

    EditText customerNameEditText;
    EditText customerAddressEditText;
    EditText customerZipEditText;
    EditText customerPhoneEditText;
    EditText customerCardEditText;
    EditText customerCardExpiryDateEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);
        Intent toppingsActivity = getIntent();

        customerNameEditText = (EditText) findViewById(R.id.customerNameInput);
        customerAddressEditText = (EditText) findViewById(R.id.customerAddressInput);
        customerZipEditText = (EditText) findViewById(R.id.customerZipCodeInput);
        customerPhoneEditText = (EditText) findViewById(R.id.customerPhoneInput);
        customerCardEditText = (EditText) findViewById(R.id.customerCardInput);
        customerCardExpiryDateEditText = (EditText) findViewById(R.id.customerCardExpiryDateInput);
    }
}
