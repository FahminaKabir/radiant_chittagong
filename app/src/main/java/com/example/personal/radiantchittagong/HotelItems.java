package com.example.personal.radiantchittagong;

import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;

/**
 * Created by Personal on 2/12/2018.
 */

public class HotelItems {
    String name;
    String details;

    public HotelItems(String name, String detils){
        this.name = name;
        this.details = detils;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

