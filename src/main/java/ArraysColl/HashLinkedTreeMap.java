package ArraysColl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashLinkedTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется порядок

        Map<Integer, String> linkedMap = new LinkedHashMap<>();// гарантируется порядок добавления

        Map<Integer, String> treeMap = new TreeMap<>();// есть возможность сортировки по значению ключа

        testMap(hashMap);
        testMap(treeMap);
        testMap(linkedMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(12, "Hunt");
        map.put(5, "Dog");
        map.put(39, "Duck");
        map.put(0, "John");
        map.put(1500, "Viasa");
        map.put(7, "Dog");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
        System.out.println();
    }
}
