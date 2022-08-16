import java.util.Scanner;

public class IntCalculatorLambdaDemo2 {
    public static void main(String[] args) {
        final int factor=10;
        System.out.println("Please enter an integer:");
        int num=new Scanner(System.in).nextInt();
        IntCalculator multiplier=x->x*factor;

        System.out.println(multiplier.calculate(num));
    }
}
