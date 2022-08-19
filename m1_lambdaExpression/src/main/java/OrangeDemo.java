import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OrangeDemo {

    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.ORANGE));
        inventory.add(new Orange(100, Color.ORANGE));
        inventory.add(new Orange(200,Color.RED));
        inventory.add(new Orange(50, Color.RED));

        Predicate<Orange> orangeByWeight= orange-> orange.getWeight()>=100;


        System.out.println(filterByWeight(inventory,orangeByWeight));



    }

    public static List<Orange> filterByWeight(List<Orange> inventory,Predicate<Orange> orangeByWeight){
        List<Orange> finalList=new ArrayList<>();
        for(Orange each:inventory){
            if(orangeByWeight.test(each)){
                finalList.add(each);
            }
        }
        return finalList;
    }
}
