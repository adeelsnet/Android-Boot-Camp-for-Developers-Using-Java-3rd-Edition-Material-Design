package com.example.carsdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class CarsItemViewHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    ImageView imageView;
    TextView textView;

    public CarsItemViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView = itemView.findViewById(R.id.cardView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
    }
}
