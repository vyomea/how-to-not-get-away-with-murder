package com.example.murdermystery;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
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

    public Map(){

    }

    public void update(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("maps").document(String.valueOf(this.id)).set(this);
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
