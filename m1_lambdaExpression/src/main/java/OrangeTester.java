import java.util.ArrayList;
import java.util.List;

public class OrangeTester {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.ORANGE));
        inventory.add(new Orange(100, Color.ORANGE));
        inventory.add(new Orange(200,Color.RED));
        inventory.add(new Orange(50, Color.RED));

        OrangeFormatter of=orange->"Pretty Orange "+orange.getWeight();
        printOrange(inventory,of);

        printOrange(inventory,orange->"Pretty Orange "+orange.getWeight()); // same with the previous line

    }

    private static void printOrange(List<Orange> inventory,OrangeFormatter oFormatter){
        for(Orange each:inventory){
            String output=oFormatter.accept(each);
            System.out.println(output);
        }

    }
}
