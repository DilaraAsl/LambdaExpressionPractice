import java.util.Scanner;

public class IntCalculatorLambdaDemo {
    public static void main(String[] args) {
        System.out.println(" Enter an integer number :");
        int num=new Scanner(System.in).nextInt();

        IntCalculator square=x->x*x;// lambda expression to create an object that implements the
        // the IntCalculator interface. A variable named square is used to reference the object.
        // The object's calculate method will return the square of the method's argument.

        System.out.println(square.calculate(num));

    }
}
/*
IntCalculator is a functional interface, we don't have to define a class
that implements the interface. We can use lambda expression to create an
object that implements the interface, and overrides its abstract method.
 */