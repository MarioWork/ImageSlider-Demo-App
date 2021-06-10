package com.example.imageslider_demoapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private SliderItemModel[] images;
    private Context context;

    public SliderAdapter(SliderItemModel[] images, Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, null, false);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        viewHolder.movieImage.setImageResource(images[position].getImageResource());

        viewHolder.movieImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(images[position].getMovieURL()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getCount() {
        return images.length;
    }


    public class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        private ImageView movieImage;
        private TextView titleTv;

        public SliderAdapterVH(View itemView) {
            super(itemView);

            titleTv = itemView.findViewById(R.id.movieTitle_tv_item);
            movieImage = itemView.findViewById(R.id.movieImage_iv_item);
        }
    }
}
