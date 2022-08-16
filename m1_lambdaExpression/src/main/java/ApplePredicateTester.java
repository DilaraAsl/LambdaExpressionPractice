import java.util.ArrayList;
import java.util.List;

public class ApplePredicateTester {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        ApplePredicate appleByWeight = (Apple apple) -> apple.getWeight() > 200;
        ApplePredicate appleByColor = (Apple apple) -> apple.getColor().equals(Color.GREEN);

       PrettyApple ap=(Apple apple)-> {if(apple.getWeight()>150) return "A Heavy "+ apple.getColor()+" apple "; return "  A Light "+apple.getColor()+" apple";};

       PrettyApple ap2=(Apple apple)->"An apple of "+apple.getWeight()+" gr";

       prettyPrintApple(inventory,ap);
        prettyPrintApple(inventory,ap2);
        System.out.println(filterApples(inventory, appleByWeight));
        System.out.println(filterApples(inventory, appleByColor));
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple eachApple : inventory) {
            if (applePredicate.test(eachApple)) {
                result.add(eachApple);
            }
        }
        return result;
    }
    public static void prettyPrintApple(List<Apple> inventory,PrettyApple ap){
        for(Apple apple : inventory){
            String output = ap.chooseApple(apple);
            System.out.println(output); }
    }

}

