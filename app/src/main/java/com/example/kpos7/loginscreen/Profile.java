package com.example.kpos7.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button home = (Button) findViewById(R.id.HOME2);
        Button profile = (Button) findViewById(R.id.profile2);
        Button order = (Button) findViewById(R.id.ORDER2);
        Button SETTING = (Button) findViewById(R.id.SETTING2);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //startActivity(new Intent("android.intent.action.MAIN"));
                //            finish();
                startActivity(new Intent(getApplicationContext(), MainCustomerScreen.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.Profile"));

            }
        });

        order.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.order"));

            }
        });

        SETTING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.kpos7.loginscreen.settings"));

            }
        });
    }
}
