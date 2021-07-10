package com.prabhakar.birdsgridview;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    private ArrayList<BirdModel> bird;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitView();
        buildList();
        setRecyclerView();
    }


    private void intitView() {
        recyclerView = findViewById(R.id.recyclerView);

    }

    private void setRecyclerView() {
        BirdAdapter birdAdapter = new BirdAdapter(bird, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(birdAdapter);
    }

    private void buildList() {

        bird = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                bird.add(new BirdModel("Eagle", R.drawable.eagle));
            } else if (i % 4 == 1) {
                bird.add(new BirdModel("Pigion", R.drawable.pigon));
            } else if (i % 4 == 2) {
                bird.add(new BirdModel("Crow", R.drawable.crow));
            } else if (i % 4 == 3) {
                bird.add(new BirdModel("Parrot", R.drawable.parrot));
            }
        }
    }

    @Override
    public void onItemClicked(BirdModel birdModel, int position) {
        new AlertDialog.Builder(this).setTitle("Bird's Name :")
                .setMessage(birdModel.getBird_name()).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }
}