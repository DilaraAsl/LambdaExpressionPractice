package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Apple {
    private Color color;
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    public void printName(String str){
        System.out.println("Delicious "+color+" "+str+" apples");
    }
    public void printClassName(){
        System.out.println(getClass().getSimpleName());
    }
    public static String printMessage(){
        return "Delicious Apples!";
    }
}

