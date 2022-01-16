package com.example.murdermystery;
import androidx.core.util.Pair;

public class CorrectRectangle {

        public CorrectRectangle( float p1, float p2, float p3, float p4) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
        }

        public float getP1() {
            return p1;
        }

        public void setP1(float p1) {
            this.p1 = p1;
        }

        public float getP2() {
            return p2;
        }
    public float getP3() {
        return p3;
    }
    public float getP4() {
        return p4;
    }

        public void setP2(float p2) {
            this.p2 = p2;
        }

        float p1;
        float p2;
        float p3;
        float p4;

}
