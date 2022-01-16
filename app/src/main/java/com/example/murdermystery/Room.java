package com.example.murdermystery;

import java.util.HashMap;

public class Room {
    public HashMap<Location,Room> interactions;
    private String imagePath;
    private CorrectRectangle rect;

    public Room(HashMap<Location, Room> interactions, String imagePath, CorrectRectangle rect) {
        this.interactions = interactions;
        this.imagePath = imagePath;
        this.rect=rect;
    }

    public Room()
    {

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

    public CorrectRectangle getRect()
    {
        return rect;
    }

    public void setRect(CorrectRectangle rect)
    {
        this.rect=rect;
    }
}
