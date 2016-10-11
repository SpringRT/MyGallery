package com.a11.mygallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView gallery = (RecyclerView) findViewById(R.id.rv_gallery_list);
        ArrayList<Integer> imageList = initImages();

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        gallery.setLayoutManager(layoutManager);

        GalleryAdapter adapter = new GalleryAdapter(imageList, this);
        gallery.setAdapter(adapter);
    }
    ArrayList<Integer> initImages()
    {
        ArrayList<Integer> images = new ArrayList<>();

        images.add(R.drawable.fifth_laptop);
        images.add(R.drawable.second_laptop);
        images.add(R.drawable.third_laptop);
        images.add(R.drawable.fourth_laptop);
        images.add(R.drawable.fifth_laptop);
        images.add(R.drawable.sixth_laptop);

        return images;
    }
}
