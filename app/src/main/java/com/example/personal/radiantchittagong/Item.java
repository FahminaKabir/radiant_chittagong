package com.example.personal.radiantchittagong;

/**
 * Created by Personal on 2/14/2018.
 */

public class Item {
    int id;
    String name;
    String notes;

    public Item(int i, String name, String notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    public Item(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
