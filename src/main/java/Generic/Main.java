package Generic;

import java.util.ArrayList;
import java.util.List;

public class Main    {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal(3));
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        print(animals);
        print(dogs);
    }

    private static void print(List<?> list){
        for (Object animal :
                list) {
            System.out.println(animal);
        }
    }
}
