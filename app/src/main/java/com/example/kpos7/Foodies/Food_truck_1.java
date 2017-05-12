package com.example.kpos7.Foodies;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.kpos7.Foodies.R.id.recipe_list_view;

public class Food_truck_1 extends AppCompatActivity {
    private ListView mListView = (ListView) findViewById(recipe_list_view);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_truck_1);
    }

}
