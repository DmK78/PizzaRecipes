package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Recipe extends AppCompatActivity {

    int imageRecource;
    String text1;
    String text3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.recipe);

        Intent recipe = getIntent();
        imageRecource=recipe.getIntExtra("imageRecource",0);
        text1 = recipe.getStringExtra("text1");
        text3 = recipe.getStringExtra("text3");
        ImageView imageView = findViewById(R.id.imageView2);
        TextView textView = findViewById(R.id.text1);
        TextView textView1 = findViewById(R.id.text2);
        this.setTitle("Recipe");
        textView.setText(text1);
        textView1.setText(text3);
        imageView.setImageResource(imageRecource);
    }
}