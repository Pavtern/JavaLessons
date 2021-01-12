package ArraysColl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueColl {
    public static void main(String[] args) {
        Person3 person = new Person3(1);
        Person3 person2 = new Person3(2);
        Person3 person3  = new Person3(3);
        Person3 person4 = new Person3(4);
        Queue<Person3> queue = new ArrayBlockingQueue<>(3);
        queue.add(person4);
        queue.add(person);
        queue.add(person2);
        System.out.println(queue.offer(person3));


    }
}
class Person3{
    private int id;

    public Person3(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Человек " +
                "id = " + id;
    }
}