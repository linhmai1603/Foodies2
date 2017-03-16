package com.example.kpos7.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCustomerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_customer_screen);
        Button home = (Button) findViewById(R.id.HOME);
        Button profile = (Button) findViewById(R.id.profile);
        Button order = (Button) findViewById(R.id.ORDER);
        Button SETTING = (Button) findViewById(R.id.SETTING);
        Button map = (Button) findViewById(R.id.map1234);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(getApplicationContext(), MainCustomerScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
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
        map.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.map"));
                //            finish();
            }
        });
    }
}
