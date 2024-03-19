package com.example.a5_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Intent intent = getIntent();
        ArrayList<String> selectedCategories = intent.getStringArrayListExtra("selectedCategories");


        TextView textViewCategories = findViewById(R.id.textViewCart);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Выбранные категории:\n");
        for (String category : selectedCategories) {
            stringBuilder.append("- ").append(category).append("\n");
        }

        textViewCategories.setText(stringBuilder.toString());
    }
}