package Filereading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadArray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("people.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        int personCount = objectInputStream.readInt();
        Person[] people = new Person[personCount];
        for (int i = 0; i < personCount; i++) {
            people[i] = (Person) objectInputStream.readObject();
        }
        objectInputStream.close();
        System.out.println(Arrays.toString(people));

    }
}
