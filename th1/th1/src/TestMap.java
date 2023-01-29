import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 20);
        hashMap.put("Anderson", 21);
        hashMap.put("Lewis", 19);
        hashMap.put("Cook", 19);
        System.out.println("Display entries in HashMap :");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key :");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 20);
        linkedHashMap.put("Anderson", 21);
        linkedHashMap.put("Lewis", 19);
        linkedHashMap.put("Cook", 19);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}