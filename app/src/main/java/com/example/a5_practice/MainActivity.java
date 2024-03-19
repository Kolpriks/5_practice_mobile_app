package com.example.a5_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toFirstActivity(View view){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void toScrollActivity(View view){
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }

    public void toRecycleActivity(View view){
        Intent intent = new Intent(this, RecyclerView.class);
        startActivity(intent);
    }

    public void toSpinnerActivity(View view){
        Intent intent = new Intent(this, Spinner.class);
        startActivity(intent);
    }
}