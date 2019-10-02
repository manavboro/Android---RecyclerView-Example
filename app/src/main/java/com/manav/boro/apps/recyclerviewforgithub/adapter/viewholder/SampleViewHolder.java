package com.manav.boro.apps.recyclerviewforgithub.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.manav.boro.apps.recyclerviewforgithub.R;
import com.manav.boro.apps.recyclerviewforgithub.model.Sample;

/**
 * Created by Manab Boro on 02,October,2019
 */
public class SampleViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView title;

    public SampleViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.text);
    }

    public void bind(RequestManager requestManager, Sample sample) {
        requestManager.load(sample.getPhoto()).into(image);
        title.setText("Item position ".concat(String.valueOf(sample.getPosition())));

    }
}
