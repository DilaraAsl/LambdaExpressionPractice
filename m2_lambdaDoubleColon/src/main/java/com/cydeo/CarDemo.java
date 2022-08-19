package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarDemo {
    public static void main(String[] args) {
        //functional interface supplier returns a car object
        // no arg constructor
        Supplier<Car> c1=()->new Car();

        Supplier<Car> c2=Car::new;
        System.out.println(c2.get().getModel());

        //one argument constructor
        Function<Integer,Car> c3=Car::new;
        System.out.println( c3.apply(1899).getModel());

        // two argument constructor accepts String and Integer and returns Car object
        BiFunction<String,Integer,Car> c4=Car::new;
        System.out.println(c4.apply("Honda",2009).toString());
    }
}
