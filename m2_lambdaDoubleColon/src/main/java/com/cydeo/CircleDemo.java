package com.cydeo;

import java.util.function.Function;
import java.util.function.Supplier;

public class CircleDemo {
    public static void main(String[] args) {
// no argument constructor supplier returns circle object
        Supplier<Circle> circle1=Circle::new;
        circle1.get().calculateArea();

        // constructor with one argument , takes in integer return circle object
        Function<Integer,Circle> circle2=Circle::new;
        System.out.println(circle2.apply(5).calculateArea());
    }
}
