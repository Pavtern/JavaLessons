package ArraysColl;

import java.sql.Connection;
import java.util.*;
import java.util.stream.Collectors;

public class InterfaceComparable {
    public static void main(String[] args) {
        List<Person2> people2 = new ArrayList<>();
        Set<Person2> people3 = new TreeSet<>();

        addElements(people2);
        addElements(people3);
        Collections.sort(people2);

        System.out.println(people2);
        System.out.println(people3);
    }

    private static void addElements(Collection<Person2> collection){
        collection.add(new Person2(3, "Hold"));
        collection.add(new Person2(1, "dfsdf"));
        collection.add(new Person2(4, "Opld"));
        collection.add(new Person2(2, "Gok"));
    }
}

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person2 person2 = (Person2) o;

        if (id != person2.id) return false;
        return Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person2 o) {
        if(this.id > o.getId()) return 1;
        if(this.id < o.getId()) return -1;

        return 0;
    }
}
