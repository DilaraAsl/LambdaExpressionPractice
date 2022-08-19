import java.util.Scanner;

//https://programs.programmingoneonone.com/2021/02/hackerrank-java-lambda-expressions-solution.html
public class PerformOperationTester {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num=new Scanner(System.in).nextInt();

        PerformOperation po=n->n%2!=0;
        System.out.println(num+" is odd:"+ po.operation(num));

        PerformOperation pPrime=n->{if(n<=1) return false;
            for (int i = 2; i <n/2 ; i++) {
                if(n%i==0) return false;
            }
            return true;
            };

        System.out.println(pPrime.operation(num));


        PerformOperation pPalindrome=n->{String s=String.valueOf(n);StringBuilder sb=new StringBuilder(); sb.append(n);sb.reverse();
        if(s.equals(sb.toString())) return true; return false;};

        System.out.println(pPalindrome.operation(num));
    }
}
