package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",75),
                new Person("Jane","Austen",35)
                );

        // Step 1: sort list by last name
        // create a method that prints all elements in the list
        // create a method that prints all people that have last name beginning with C
        Consumer<Person> consumerList=System.out::println;

      // personList.forEach(p->consumerList.accept(p));
    }
}
