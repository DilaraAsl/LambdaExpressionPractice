package com.cydeo;

import java.util.function.BiFunction;

public class StringClassDemo {
    public static void main(String[] args) {

        BiFunction<String,Integer,String> func=(str,i)->str.substring(i);

        // String class -String method
        BiFunction<String,Integer,Character> func2=String::charAt;

        System.out.println( func.apply("Student",4));
        System.out.println(func2.apply("Home Alone",5));
    }
}
