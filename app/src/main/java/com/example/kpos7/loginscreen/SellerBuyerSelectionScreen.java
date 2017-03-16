package com.example.kpos7.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SellerBuyerSelectionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_buyer_selection_screen);
    }
    public void selectVendor(View view){
        Intent intent = new Intent(this, MainVendorScreen.class);
        startActivity(intent);
    }
    public void selectCustomer(View view){
        Intent intent = new Intent(this, MainCustomerScreen.class);
        startActivity(intent);
    }

}
