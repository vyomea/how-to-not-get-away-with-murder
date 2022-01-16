package com.example.murdermystery;

import java.util.HashMap;

public class Map {
    private HashMap<Rectangle,Room> rooms;
    private String name;
    private String description;
    private int id;

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

    public Map(HashMap<Rectangle, Room> rooms, String description,String name, int id) {
        this.rooms = rooms;
        this.description = description;
        this.name = name;
        this.id = id;
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
