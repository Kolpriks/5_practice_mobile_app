package com.example.a5_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.a5_practice.R;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    public void backToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void sendCategories(View view) {
        ListView listView = findViewById(R.id.listView);
        SparseBooleanArray checkedItems = listView.getCheckedItemPositions();
        ArrayList<String> selectedCategories = new ArrayList<>();

        for (int i = 0; i < checkedItems.size(); i++) {
            int position = checkedItems.keyAt(i);
            if (checkedItems.valueAt(i)) {
                selectedCategories.add((String) listView.getItemAtPosition(position));
            }
        }

        Intent intent = new Intent(this, CartActivity.class);
        intent.putStringArrayListExtra("selectedCategories", selectedCategories);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String[] fruits = null;

        String message = getIntent().getStringExtra("message");


        switch (message) {
            case "bananas":
                fruits = getResources().getStringArray(R.array.bananas);
                break;
            case "apples":
                fruits = getResources().getStringArray(R.array.apples);
                break;
            case "cherries":
                fruits = getResources().getStringArray(R.array.cherries);
                break;
            case "pears":
                fruits = getResources().getStringArray(R.array.pears);
                break;
            case "melons":
                fruits = getResources().getStringArray(R.array.melons);
                break;
            case "watermelons":
                fruits = getResources().getStringArray(R.array.watermelons);
                break;
            case "peaches":
                fruits = getResources().getStringArray(R.array.peaches);
                break;
            case "lemons":
                fruits = getResources().getStringArray(R.array.lemons);
                break;
            case "cucumbers":
                fruits = getResources().getStringArray(R.array.cucumbers);
                break;
            case "mandarins":
                fruits = getResources().getStringArray(R.array.mandarins);
                break;
            case "cocos":
                fruits = getResources().getStringArray(R.array.cocos);
                break;
        }

        // Если фрукты были определены, создаем и заполняем список с чекбоксами
        if (fruits != null) {
            ListView listView = findViewById(R.id.listView);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, fruits);
            listView.setAdapter(adapter);
            listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        }
    }
}
