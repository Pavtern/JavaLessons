package ArraysColl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewArray {
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1(4, "Foma"));
        people.add(new Person1(1, "Alex"));
        people.add(new Person1(7, "Katea"));

        Collections.sort(people, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                if(o1.getId() > o2.getId())return 1;
                if(o1.getId() < o2.getId())return -1;
                return 0;
            }
        });
        System.out.println(people);
    }


}

class Person1 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
