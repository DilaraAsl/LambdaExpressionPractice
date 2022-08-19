package com.cydeo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CalculatorDemo {
    public static void main(String[] args) {
        // interface
        Calculate calculateSum=(x,y)-> System.out.println(x+y);
        // Example referencing to a static method
        //interface              class::static method
        Calculate calculateSum2=Calculator::findSum;
        calculateSum2.calculate(10,23);

        //functional interface accepts two integers returns void
        BiConsumer<Integer,Integer> calculateSum3=Calculator::findSum;
        calculateSum3.accept(123,45);

        // Example referencing to an instance method
        Calculator myCalculator=new Calculator();
        BiConsumer<Integer,Integer> calculateMultiples=myCalculator::findMultiple;

        Calculate myCalculator2=new Calculator()::findMultiple;

        calculateMultiples.accept(12,11);
        myCalculator2.calculate(23,45);


    }
}
