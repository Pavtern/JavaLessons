package ArraysColl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        System.out.print("linked: ");
        measureTime(linkedList);
        System.out.print("array: ");

        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add( i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
//        for (int i = 0; i <100000; i++) {
//            list.get(i);
//        } get and add in the and is much more faster for the ArrayList
    }
}
