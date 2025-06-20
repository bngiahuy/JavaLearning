import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// This code demonstrates the use of different Set implementations in Java.

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // HashSet does not maintain order, but is efficient for lookups (O(1) on average)
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("strawberry");
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>(); // LinkedHashSet maintains insertion order
        linkedHashSet.add("orange");
        linkedHashSet.add("kiwi");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>(); // TreeSet sorts the elements
        treeSet.add("grape");
        treeSet.add("pear");
        System.out.println("TreeSet: " + treeSet);
    }
}
