package com.example.a5_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.chereshnya, "В мире, где царит аромат черешни"));
        items.add(new Item(R.drawable.lemon, "В тени зелёных листьев лимонного деревай "));
        items.add(new Item(R.drawable.cucumber, "В мире, где царит аромат черешни"));
        items.add(new Item(R.drawable.pineapple, "В тени зелёных листьев лимонного деревай "));

        // Добавьте другие элементы

        MyAdapter adapter = new MyAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }

    public void backToMain(View view){
        finish();
    }
}