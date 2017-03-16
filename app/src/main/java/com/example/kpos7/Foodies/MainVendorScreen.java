package com.example.kpos7.Foodies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainVendorScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vendor_screen);
        Button returnBtn = (Button) findViewById(R.id.button5);

        returnBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), SellerBuyerSelectionScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
    }
    public void showOrders(View view){
        Intent intent = new Intent(this, DisplayOrders.class);
        startActivity(intent);
    }

    public void editMenu(View view){
        Intent intent = new Intent(this, EditDisplayMenu.class);
        startActivity(intent);
    }

    public void editLocation(View view){
        Intent intent = new Intent(this, EditDisplayLocation.class);
        startActivity(intent);
    }

    public void showReviews(View view){
        Intent intent = new Intent(this, DisplayReviewRatings.class);
        startActivity(intent);
    }



}
