package com.cydeo;
import java.util.stream.*;
public class GFG {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("Texas","New York","Illinois","California");
        stream.forEach(System.out::println);
    }
}
