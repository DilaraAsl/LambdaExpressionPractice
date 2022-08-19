import java.util.function.*;

public class FunctionalInterfaceDemoTwo {
    public static void main(String[] args) {


        // apply method
        Function<Integer, Double> divisionFunction = i -> i / 3.0;
        System.out.println(divisionFunction.apply(12));
        // andThen && apply
        Function<Double, Double> squareFunction = i -> i * i;
        Function<Double, Double> subtractionFunction = i -> i - 10.0;
        System.out.println(squareFunction.andThen(subtractionFunction).apply(9.0));// andThen is a default method
        System.out.println(squareFunction.compose(subtractionFunction).apply(12.0));// compose is a default method first subtraction then taking the square

// IntToDoubleFunction accepts int primitive value and returns a double value

        IntToDoubleFunction divFunction = t -> t / 3.0;
        System.out.println(divFunction.applyAsDouble(15));


        BiFunction<Integer, Integer, Integer> multiBiFunction = (x, y) -> x * y;
        Function<Integer, Integer> addBiFunction = x -> x + 10;
        System.out.println(multiBiFunction.apply(6, 9));
        System.out.println(multiBiFunction.andThen(addBiFunction).apply(7, 8)); //andThen accepts Function which accepts only one parameter

        // Predicate boolean test(T t)

        Predicate<String> predicate = s -> s.startsWith("A");
        Predicate<String> predicate2 = s -> s.length() == 4;
        System.out.println(predicate.test("Apple"));
        System.out.println(predicate.and(predicate2).test("Apple"));
        System.out.println(predicate.or(predicate2).test("Team"));
        System.out.println(predicate2.negate().test("Lambda"));


        // Supplier does not take an argument but returns a result get()

        Supplier<Double> supplyRandomNo = Math::random;
        System.out.println(supplyRandomNo.get());

        // Consumer takes a parameter but does not return anything
    Consumer<String> consumer=System.out::println;
        Consumer<String> consumer1=t->System.out.println(t+"Consumer 1");
    Consumer<String> consumer2=s->System.out.println(s+"Consumer 2");
    consumer.accept("Cydeo");
    consumer1.andThen(consumer2).accept("Testing "); // Testing is passed as an argument to both consumer 1 then to consumer 2

    }
}
