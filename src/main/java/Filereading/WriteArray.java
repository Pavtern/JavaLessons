package Filereading;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteArray {
    public static void main(String[] args) throws IOException {
        Person[] people = {new Person(1,"qwe"), new Person(2,"asd"),new Person(3,"zxc")};

        FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(people);
//        objectOutputStream.writeInt(people.length);
//        for(Person person: people){
//            objectOutputStream.writeObject(person);
//        }
        objectOutputStream.close();
    }
}
