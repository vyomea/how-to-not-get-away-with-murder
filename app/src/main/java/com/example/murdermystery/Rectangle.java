package com.example.murdermystery;

import androidx.core.util.Pair;

public class Rectangle {
    public Rectangle(Pair<Long, Long> p1, Pair<Long, Long> p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Pair<Long, Long> getP1() {
        return p1;
    }

    public void setP1(Pair<Long, Long> p1) {
        this.p1 = p1;
    }

    public Pair<Long, Long> getP2() {
        return p2;
    }

    public void setP2(Pair<Long, Long> p2) {
        this.p2 = p2;
    }

    Pair<Long, Long> p1;
    Pair<Long, Long> p2;


}
