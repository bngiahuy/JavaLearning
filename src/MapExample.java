import java.util.*;


public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>(); // HashMap is a commonly used implementation of the Map interface
        // Insert elements into the map
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        System.out.println("Map at key 'one': " + hashMap.get("one"));
        // Update an element in the map
        hashMap.put("one", 11);
        System.out.println("Updated Map at key 'one': " + hashMap.get("one"));
        // Remove an element from the map
        hashMap.remove("one");
        System.out.println("Map after removing key 'one': " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // LinkedHashMap maintains insertion order
        linkedHashMap.put("two", 2);
        linkedHashMap.put("one", 1);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(); // TreeMap sorts the keys
        treeMap.put("three", 3);
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        System.out.println("TreeMap: " + treeMap);

        Map<String, Integer> hashTable = new Hashtable<>(); // Hashtable is synchronized (less common in modern applications)
        hashTable.put("four", 4);
        hashTable.put("five", 5);
        System.out.println("Hashtable: " + hashTable);
    }
}
