package New;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        ForEach forEach = new ForEach();
        forEach.fan();
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
//        do{
//            System.out.println("Введи \"5\"");
//            value = s.nextInt();
//        } while (value!=5);

        boolean[] bool = new boolean[5];
        System.out.printf("Значения массива: %b, %b, %b\n", bool[0], bool[1],bool[3]);
        switch (value){
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 15:
                System.out.println("15");
                break;
            case 18:
                System.out.println("18");
                break;
            default:
                System.out.println("Даже не знаю что нам с тобой делать...");
        }
    }
}
