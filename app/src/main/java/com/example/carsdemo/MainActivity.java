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

        //Create a reference to the RecyclerView in activity_main.xml
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // set number of columns to 1 or 2 for portrait or landscape respectively
        // Please note the use of an xml integer here: portrait will be 2x2 and landscape 1x4; neat!
        final int COLUMNS = getResources ().getInteger (R.integer.rv_columns);

        // create and set a Grid Layout Manager to use as the Layout Manager for this RV
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, COLUMNS);
        recyclerView.setLayoutManager(gridLayoutManager);


        //Create and set a Grid Layout Manager  to use as the Layout Manager for this RV
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        //recyclerView.setLayoutManager(gridLayoutManager);

        //Create and set an adaptor to use as the Layout Manager for this RV
        CarsItemAdapter carsItemAdapter = new CarsItemAdapter(carImages, carNames);
        recyclerView.setAdapter(carsItemAdapter);
    }
}
