package com.example.personal.radiantchittagong;

/**
 * Created by Personal on 2/14/2018.
 */

public class Place {
    String name;
    String details;
    public Place(String name, String details){
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
