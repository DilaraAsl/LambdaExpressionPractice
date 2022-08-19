package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StaticMethodDemo {
    public static void main(String[] args) {

        //Static method syntax: (ClassName::methodName)
        //Example:  SomeClass::someStaticMethod
        List<String> courseList= Arrays.asList("Java","Data Structures","Agile","GitHub");
        courseList.forEach(StaticMethodDemo::printCourses);

    }
    static void printCourses(String course){
        System.out.println(course);
    }

}
