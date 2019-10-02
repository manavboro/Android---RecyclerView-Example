package com.manav.boro.apps.recyclerviewforgithub.model;

/**
 * Created by Manab Boro on 02,October,2019
 */
public class Sample {

    private int position;
    private int photo;

    public Sample(int photo, int position) {
        this.position = position;
        this.photo = photo;

    }

    public int getPosition() {
        return position;
    }

    public int getPhoto() {
        return photo;
    }
}
