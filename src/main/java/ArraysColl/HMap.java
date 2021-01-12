package ArraysColl;

import java.util.HashMap;
import java.util.Map;

public class HMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();


        hashMap.put("One", 1);
        hashMap.put("Three", 3);
        hashMap.put("Two", 2);

        System.out.println(hashMap);
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
