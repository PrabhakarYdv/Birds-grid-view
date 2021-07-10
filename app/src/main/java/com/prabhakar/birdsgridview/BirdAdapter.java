package com.prabhakar.birdsgridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BirdViewHolder> {
    private ArrayList<BirdModel> bird_list;
    private ClickListener clickListener;

    public BirdAdapter(ArrayList<BirdModel> bird_list, ClickListener clickListener) {
        this.bird_list = bird_list;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public BirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new BirdViewHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdViewHolder holder, int position) {
        BirdModel birdModel =bird_list.get(position);
        holder.setData(birdModel);
    }

    @Override
    public int getItemCount() {
        return bird_list.size();
    }
}
