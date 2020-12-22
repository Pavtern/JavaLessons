package Filereading;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "qwe");
        Person person2 = new Person(2, "asd");

        FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person1);
        objectOutputStream.writeObject(person2);
        objectOutputStream.close();
    }
}
