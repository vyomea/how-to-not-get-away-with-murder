package com.example.murdermystery;

public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public User(){}
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
