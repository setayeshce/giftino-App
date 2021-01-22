package com.example.giftino;


import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class ItemHome {
    private int id;
    private Drawable image;
    private String title;

    public ItemHome(int id, Drawable image, String title) {
        this.id = id;
        this.image = image;
        this.title = title;
    }
    public ItemHome(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

