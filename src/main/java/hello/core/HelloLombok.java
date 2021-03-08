package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;
    private Date date;

    public static void main(String[] args) {
        HelloLombok lombok = new HelloLombok();
        lombok.setName("asdf");
        lombok.setAge(12);
        lombok.setDate(new Date());

        System.out.println("lombok = " + lombok);
    }
}