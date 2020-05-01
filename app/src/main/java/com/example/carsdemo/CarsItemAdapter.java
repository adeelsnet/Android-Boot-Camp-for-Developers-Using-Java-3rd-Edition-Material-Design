package com.example.carsdemo;

import android.animation.Animator;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CarsItemAdapter extends RecyclerView.Adapter<CarsItemViewHolder> {
    private int[] carImages;
    private String[] carNames;

    public CarsItemAdapter(int[] carImages, String[] carNames) {
        this.carImages = carImages;
        this.carNames = carNames;
    }

    @NonNull
    @Override
    public CarsItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Make one "tile"; this will be called once per number of
        //visible tiles on the screen
        View itemView = LayoutInflater.from(
                parent.getContext()).inflate(
                        R.layout.rv_item, parent, false);
        return new CarsItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsItemViewHolder holder, int position) {
        // Insert into this tile the image and the name of the
        // car we are up to
        holder.imageView.setImageResource(carImages[position]);
        holder.textView.setText(carNames[position]);
    }

    @Override
    public void onViewAttachedToWindow(@NonNull CarsItemViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        animateCard(holder.cardView);
    }

    private void animateCard(CardView view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int centerX = 0, centerY = 0, startRadius = 0;
            int endRadius = Math.max(view.getWidth(), view.getHeight());
            Animator circularRevealAnimationOfCard = ViewAnimationUtils.createCircularReveal
                    (view, centerX, centerY, startRadius, endRadius);
            circularRevealAnimationOfCard.start();
        }
    }


    @Override
    public int getItemCount() {
        return carImages.length;
    }
}
