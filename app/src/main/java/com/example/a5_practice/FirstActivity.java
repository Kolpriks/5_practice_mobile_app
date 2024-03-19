package com.example.a5_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ListView fruitsListView = (ListView)  findViewById(R.id.fruitList);
        String[] fruitsList = getResources().getStringArray(R.array.fruits);
        fruitsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = fruitsList[position];
                String message = selectedItem;

                Intent intent = new Intent (FirstActivity.this, SecondActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);
            }
        });
    }
}