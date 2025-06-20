import java.util.ArrayList;
import java.util.Collections;

public class ListSortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Sort ascending order
        Collections.sort(myNumbers);
        System.out.println("Sorted in ascending order:");
        for (int i : myNumbers) {
            System.out.println(i);
        }
        // Sort descending order
        myNumbers.sort(Collections.reverseOrder());
        System.out.println("Sorted in descending order:");
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
