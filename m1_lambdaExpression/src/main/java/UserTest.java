import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(Arrays.asList(new User("Mike", "Smith", 35),
                new User("Tom", "Evan", 25),
                new User("Emma", "Pollard", 55)));

        Function<User, String> returnUserName = u -> {
            if (u.getFirstName().charAt(0) == 'E') return u.getFirstName();
            return null;
        };
        for (User each : users) {
            if (returnUserName.apply(each) != null) {
                System.out.println(each.getFirstName());

            }
        }
            System.out.println("***********************************************");
          //  Predicate<User> lastNameE=u->{if (u.getLastName().charAt('E')=='E') return true; return false;};

//printName(users,lastNameE);

printName(users, user->user.getLastName().startsWith("E"));
        }



    private static void printName(List<User> users, Predicate<User> p){
        for(User each:users){
            if(p.test(each))
            {
                System.out.println(each.getLastName());
            }
        }

    }
}