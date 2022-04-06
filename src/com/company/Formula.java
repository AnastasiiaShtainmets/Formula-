package com.company;

public class Formula {
    float x;
    float y;
    float z;
    public Formula(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void displayFormula() {
        double vector = Math. sqrt( Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) );
        System.out.println(vector);
    }
}
