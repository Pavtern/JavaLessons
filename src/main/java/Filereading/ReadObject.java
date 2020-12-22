package Filereading;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("people.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        Person person1 = (Person) objectInputStream.readObject();
//        Person person2 = (Person) objectInputStream.readObject();
        Person[] people = (Person[]) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(Arrays.toString(people));
//        System.out.println(person1);
//        System.out.println(person2);
    }
}
