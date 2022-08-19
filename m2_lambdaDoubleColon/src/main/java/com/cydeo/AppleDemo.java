package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class AppleDemo {
    public static void main(String[] args) {
        BiFunction<Color,Double,Apple> appleBiFunction=Apple::new;
        appleBiFunction.apply(Color.GREEN,125.0).printClassName();

        //one argument constructor
        Function<Double,Apple> appleFunction=Apple::new;
        appleFunction.apply(50.0).getWeight();
        //
        Apple myApple=new Apple(Color.RED,200);

        // static method
        Supplier<String> functionPrint=Apple::printMessage;

        // instance method
        Consumer<String> consApple=myApple::printName;

     consApple.accept("envy");





    }
}
