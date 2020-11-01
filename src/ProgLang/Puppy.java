package ProgLang;

public class Puppy{

    int puppyAge;

    public Puppy(String name){
        // Это конструктор и у него один параметр, name.
        System.out.println("Передаваемое имя:" + name );
    }
    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("Возраст щенка:" + puppyAge );
        return puppyAge;
    }
    public static void main(String []args){
        /* Создание объекта. */
        Puppy myPuppy = new Puppy( "Багет" );

    }

}