package lesson54;

import java.util.*;

public class Pmap {
    public static void main(String[] args) {
        Map map5 = new HashMap<>();
        Map map1 = new Hashtable();
        Map map = new LinkedHashMap();
        Map map3 = new TreeMap<>();
        map.put("1", "one");
        map.put("3", "three");
        map.put("2", "two");
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o: set){
            System.out.println(o);
        }
    }
}
