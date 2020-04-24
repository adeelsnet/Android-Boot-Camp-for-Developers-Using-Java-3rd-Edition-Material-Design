package com.example.carsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private   int [] carImages = {
            R.drawable.accura,
            R.drawable.audi,
            R.drawable.ferrari,
            R.drawable.infinity,
            R.drawable.lexus,
            R.drawable.mercedes,
            R.drawable.mustang,
            R.drawable.porche,
            R.drawable.tesla
    };
    private String [] carNames ={
            "Acura",
            "Audi",
            "Ferrari",
            "Infinity",
            "Lexus",
            "Mercedes",
            "Mustang",
            "Porch",
            "Tesla"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}
