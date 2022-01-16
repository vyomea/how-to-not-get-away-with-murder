package com.example.murdermystery;

public class Location {
    long x;
    long y;
    long r;

    public Location(long x, long y, long r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Location(long x, long y) {
        this.x = x;
        this.y = y;
        this.r = 1;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getR() {
        return r;
    }

    public void setR(long r) {
        this.r = r;
    }
}
