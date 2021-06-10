package com.example.imageslider_demoapp;

public class SliderItemModel {

    private int id;
    private String title;
    private int imageResource;
    private String movieURL;


    public SliderItemModel(int id, String title, int imageResource, String movieURL) {
        this.id = id;
        this.title = title;
        this.imageResource = imageResource;
        this.movieURL = movieURL;
    }

    public String getMovieURL() {
        return movieURL;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }
}
