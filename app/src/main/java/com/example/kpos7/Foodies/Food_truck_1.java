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
        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);
        RecipeAdapter adapter = new RecipeAdapter(this, recipeList);
        mListView.setAdapter(adapter);
        final Context context = this;
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 1
                Recipe selectedRecipe = recipeList.get(position);

                // 2
                Intent detailIntent = new Intent(context, RecipeDetailActivity.class);

                // 3
                detailIntent.putExtra("title", selectedRecipe.title);
                detailIntent.putExtra("url", selectedRecipe.instructionUrl);

                // 4
                startActivity(detailIntent);
            }

        });
    }

}
