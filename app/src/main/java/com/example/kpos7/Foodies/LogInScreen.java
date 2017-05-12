package com.example.kpos7.Foodies;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class LogInScreen extends AppCompatActivity {
    //MediaPlayer button_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);
        ImageButton loginBtn = (ImageButton) findViewById(R.id.loginBtn);
        final EditText usernameEdit = (EditText)   findViewById(R.id.usernameEdit);
        final EditText passwordEdit = (EditText)   findViewById(R.id.passwordEdit);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = "";
                String password = "";
                username = usernameEdit.getText().toString().toLowerCase();
                password = passwordEdit.getText().toString().toLowerCase();
                if (((username.equals("test") && password.equals("testusing")) || (username.equals("sonny") && password.equals("sonny")))){
                    startActivity(new Intent("android.intent.action.SellerBuyerSelection"));
                }else{
                    passwordEdit.setError("Username or password is incorrect", null);
                }

            }
        });
    }
}
