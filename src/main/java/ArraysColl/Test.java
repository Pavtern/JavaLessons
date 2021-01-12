package ArraysColl;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
