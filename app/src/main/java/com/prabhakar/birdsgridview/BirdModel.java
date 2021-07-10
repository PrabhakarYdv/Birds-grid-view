package com.prabhakar.birdsgridview;

public class BirdModel {
    private int img;
    private String bird_name;

    public BirdModel( String bird_name,int img) {
        this.img = img;
        this.bird_name = bird_name;
    }

    public int getImg() {
        return img;
    }

    public String getBird_name() {
        return bird_name;
    }
}
