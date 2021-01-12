package ArraysColl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        set1.add("Zoia");
        set1.add("Vasia");
        set1.add("Masha");
        set1.add("Kolia");
        set1.add("Borea");
        set1.add("Jordan");

        set2.add("Zoia");
        set2.add("Vasia");
        set2.add("Gosha");
        set2.add("Ghora");
        set2.add("Lada");

        Set<String> union  = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        Set<String> difference = new HashSet<>(set1);

        difference.removeAll(set2);
        System.out.println(difference);

//        for (String name : hashSet){
//            System.out.println(name);
//        }
//        System.out.println(hashSet);
//
//        System.out.println(hashSet.contains("Foma"));;
//        System.out.println(hashSet.contains("Borea"));;
//        System.out.println(hashSet.isEmpty());

    }

}


//
//        linkedHashSet.add("Vasia");
//        linkedHashSet.add("Masha");
//        linkedHashSet.add("Zoia");
//        linkedHashSet.add("Kolia");
//        linkedHashSet.add("Borea");
//
//        treeSet.add("Vasia");
//        treeSet.add("Masha");
//        treeSet.add("Zoia");
//        treeSet.add("Kolia");
//        treeSet.add("Borea");


//
//        System.out.println();
//                for(String name : linkedHashSet){
//                System.out.println(name);
//                }
//                System.out.println();
//                for(String name : treeSet){
//                System.out.println(name);
//                }
