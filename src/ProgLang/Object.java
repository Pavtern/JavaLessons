package ProgLang;

public class Object {

    
    public Object (String name){
        System.out.println("Название объекта: " + "\"" + name + "\"");
    }

    public static void main(String[] args) {
        Object myObject = new Object("Ручка");
    }
    

}
