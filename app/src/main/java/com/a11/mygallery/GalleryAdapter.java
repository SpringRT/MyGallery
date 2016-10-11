package com.a11.mygallery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ImageViewHolder>  {

    private ArrayList<Integer> resImages;
    private Context context;

    public GalleryAdapter(ArrayList<Integer> resImages, Context context) {
        this.resImages = resImages;
        this.context = context;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
              View v = LayoutInflater.from(parent.getContext()).
              inflate(R.layout.item_gallery, parent, false);

        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, final int position) {

        holder.iv.setImageResource(resImages.get(position));
        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageDialog dialog = new ImageDialog(context, resImages.get(position));
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return resImages.size();
    }


    public static class ImageViewHolder extends RecyclerView.ViewHolder
    {
        ImageView iv;

        public ImageViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.iv_gallery_image);
        }

    }
}
