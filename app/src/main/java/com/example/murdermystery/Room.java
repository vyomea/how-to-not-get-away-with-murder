package com.example.murdermystery;

import java.util.HashMap;

public class Room {
    public HashMap<Location,Room> interactions;
    private String imagePath;

    public Room(HashMap<Location, Room> interactions, String imagePath) {
        this.interactions = interactions;
        this.imagePath = imagePath;
    }

    public HashMap<Location, Room> getInteractions() {
        return interactions;
    }

    public void setInteractions(HashMap<Location, Room> interactions) {
        this.interactions = interactions;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
