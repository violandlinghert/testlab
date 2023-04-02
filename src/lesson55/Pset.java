package lesson55;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pset {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        Set set2 = new LinkedHashSet();
        Set set3 =new TreeSet();

        set.add("1");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("2");

        for (Object o: set){
            System.out.println(o);
        }
    }
}
