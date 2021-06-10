package com.example.imageslider_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    private SliderView sliderView;
    
    SliderItemModel[] images = {
            new SliderItemModel(0, "Spiderman Far From Home", R.drawable.one, "https://www.imdb.com/title/tt6320628/"),
            new SliderItemModel(1, "Avengers Endgame", R.drawable.two, "https://www.imdb.com/title/tt4154796/?ref_=fn_al_tt_1"),
            new SliderItemModel(2, "Spiderman Homecomming", R.drawable.three, "https://www.imdb.com/title/tt2250912/?ref_=fn_al_tt_1"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        sliderView = findViewById(R.id.imageSlider_main);

        //Create adapter instance
        SliderAdapter sliderAdapter = new SliderAdapter(images, this);


        //Set the adapter
       sliderView.setSliderAdapter(sliderAdapter);

        //Set animation
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setScrollTimeInSec(3);
        sliderView.startAutoCycle();
    }
}