package com.example.kpos7.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button home = (Button) findViewById(R.id.HOME3);
        Button profile = (Button) findViewById(R.id.profile3);
        Button order = (Button) findViewById(R.id.ORDER3);
        Button SETTING = (Button) findViewById(R.id.SETTING3);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), MainCustomerScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                //            finish();
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.Profile"));
                //            finish();
            }
        });
        order.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.order"));
                //            finish();
            }
        });
        SETTING.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.settings"));
                //            finish();
            }
        });
    }
}
