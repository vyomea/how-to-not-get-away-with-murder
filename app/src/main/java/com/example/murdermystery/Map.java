package com.example.murdermystery;

import java.util.HashMap;

public class Map {
    private HashMap<Rectangle,Room> rooms;
    private String description;

    public Map(HashMap<Rectangle, Room> rooms, String description) {
        this.rooms = rooms;
        this.description = description;
    }

    public HashMap<Rectangle, Room> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Rectangle, Room> rooms) {
        this.rooms = rooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
