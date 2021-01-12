package ArraysColl;

import java.util.*;

public class ListCom {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Rabit");
        animals.add("as");
        animals.add("asfsdfsdfsdf");
        animals.add("Duck");
        animals.add("Frog");
        animals.add("Dog");
        animals.add("q");

        Collections.sort(animals, new StringLengthComparator());

        System.out.println(animals);

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(4);
        integers.add(400);
        integers.add(34);
        integers.add(18);

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return -1;
                if(o1 < o2) return 1;
                return 0;
            }
        });
        System.out.println(integers);
    }
}
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        if (o1.length() < o2.length()) return -1;
        return 0;
    }
}
class IntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) return -1;
        if(o1 < o2) return 1;
        return 0;
    }
}
