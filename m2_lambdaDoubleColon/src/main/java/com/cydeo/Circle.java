package com.cydeo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Circle {
    private int radius;

    public Circle(int radius) {
       setRadius(radius);
    }

    public int getRadius() {
        return radius;

    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return radius*radius*3.14;
    }

}
