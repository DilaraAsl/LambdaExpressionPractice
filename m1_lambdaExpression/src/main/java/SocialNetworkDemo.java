import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocialNetworkDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(new Person("male", 44), new Person("female", 15),
                new Person("male", 19), new Person("male", 24)));

        SocialNetwork sn = (Person person) -> (person.getGender().equals("male") && (person.getAge() >= 18 && person.getAge() <= 25)); // boolean condition
        System.out.println(filterToSend(list,sn));

    }
    private static List<Person> filterToSend(List<Person> list,SocialNetwork sn){
        List<Person> result=new ArrayList<>();
        for(Person each:list){
            if(sn.sendMessage(each))
                result.add(each);
        }
        return result;
    }
}
