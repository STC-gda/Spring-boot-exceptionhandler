package Project.Exceptions.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private Long id;
    private String name;

    public Person(Long id, String name){
        this.id = id;
        this.name = name;
    }

}
