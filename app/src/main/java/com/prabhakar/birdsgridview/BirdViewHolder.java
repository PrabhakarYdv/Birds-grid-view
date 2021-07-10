package com.prabhakar.birdsgridview;


import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class BirdViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private CardView card;
    private ClickListener clickListener;

    public BirdViewHolder(@NonNull View itemView, ClickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        initview(itemView);
    }

    private void initview(View itemView) {
        img = itemView.findViewById(R.id.img);
        card = itemView.findViewById(R.id.card);
    }

    public void setData(BirdModel birdModel) {
        img.setImageResource(birdModel.getImg());
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClicked(birdModel, getAdapterPosition());
            }
        });
    }
}
