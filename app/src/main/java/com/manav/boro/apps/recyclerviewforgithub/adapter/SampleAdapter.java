package com.manav.boro.apps.recyclerviewforgithub.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.manav.boro.apps.recyclerviewforgithub.R;
import com.manav.boro.apps.recyclerviewforgithub.adapter.viewholder.SampleViewHolder;
import com.manav.boro.apps.recyclerviewforgithub.model.Sample;

import java.util.ArrayList;

/**
 * Created by Manab Boro on 02,October,2019
 */
public class SampleAdapter extends RecyclerView.Adapter<SampleViewHolder> {

    private LayoutInflater mInflater;
    private ArrayList<Sample> mData;

    private RequestManager requestManager;

    public SampleAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        mData = new ArrayList<>();

        requestManager = Glide.with(context);


    }

    @NonNull
    @Override
    public SampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SampleViewHolder(mInflater.inflate(R.layout.single_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SampleViewHolder holder, int position) {
        holder.bind(requestManager, mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void updateData(ArrayList<Sample> data) {
        mData = data;
        notifyDataSetChanged();
    }
}
