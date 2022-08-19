import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
    /*    ApplePredicate ap=new ApplePredicate() {  // anonymous class--> it is not an object of the interface
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;

            }
        }; */

        //PREDICATE
        Predicate<Integer> lessThan = i -> i < 18; // Predicate Interface accepts object our object is Integer
        System.out.println(lessThan.test(4));
        System.out.println("*********************Predicate Ends*****************************");


        //CONSUMER

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(15);

        System.out.println("**************************Consumer Ends************************");

        //BI CONSUMER

        BiConsumer<Integer,Integer> addTwo=(x,y)->System.out.println(x+y); // when we have two parameters we need to place them in parentheses
        addTwo.accept(12,32);

        System.out.println("************************Bi Consumer Ends ******************************");
        // FUNCTION import the class first
        Function<String,String> fun=s->"Hello "+s; // Function<T,R> T- accepts an object and R returns an object
        System.out.println(fun.apply("Dilara"));

        System.out.println("***************************Function Ends**********************************");

        BiFunction<Integer,Integer,Integer> biFunc=(x,y)->x*y; //<T,U,R> Accepts two objects and returns and object

        System.out.println( biFunc.apply(5,6));
        System.out.println("**********************BiFunction Ends***************************************");

        //SUPPLIER
        Supplier<Double> randomValue=()->Math.random()*10;

        System.out.println(randomValue.get());

    }
}
