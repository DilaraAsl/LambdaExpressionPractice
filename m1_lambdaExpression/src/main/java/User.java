import lombok.*;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data // if no constructor provided @Data will provide non arg constructor, getter, setter, tostring included
// in java development world @Data is not used as much instead we put @Getter @Setter ... etc...
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
}
