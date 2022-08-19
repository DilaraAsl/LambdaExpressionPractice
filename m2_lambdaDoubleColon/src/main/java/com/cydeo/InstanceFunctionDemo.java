package com.cydeo;

import java.util.function.Function;

public class InstanceFunctionDemo {
    public static void main(String[] args) {
        // Instance method syntax: (objectOfClass::methodName)
        // System.out::println

        Function<Integer,Double> circleFunction=t->new Circle(t).calculateArea();
    }
}
