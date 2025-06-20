import java.util.Arrays;

public class ConditionExample {
    public static void main(String[] args) {
        // If...else
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Switch case
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            case "Saturday": // Fall through case
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Midweek day");
        }

        // Ternary operator
        int a = 5, b = 10;
        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";
        System.out.println("Result of ternary operation: " + result);

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        for (int i = 0; i <= 30; i += 5) {
            System.out.println("For loop iteration with step 5: " + i);
        }

        for(int i = 0, j = 5; i < j && j > 0; i++, j--) {
            System.out.println("For loop with two variables: i = " + i + ", j = " + j);
        }

        // While loop
        int count = 0;
        while(count < 5) {
            System.out.println("While loop iteration: " + count);
            count++;
        }

        // Do-while loop
        int doCount = 0;
        do {
            System.out.println("Do-while loop iteration: " + doCount);
            doCount++;
        } while(doCount < 5);

        // Break, continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // Exit the loop
            }
            if (i % 2 == 0) { // Can write i & 1 to check if i is even
                System.out.println("Skipping even number: " + i);
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println("Odd number: " + i);
        }

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        if (condition1 && condition2) {
            System.out.println("Both conditions are true");
        } else if (condition1 || condition2) {
            System.out.println("At least one condition is true");
        } else {
            System.out.println("Neither condition is true");
        }

        // Instanceof operator
        Object obj = "Hello, World!";
        if (obj instanceof String) {
            String str = (String) obj; // Safe cast
            System.out.println("Object is a String: " + str);
        } else {
            System.out.println("Object is not a String");
        }

        // Enhanced for loop (for-each)
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            // Can't change the value if using for-each loop
            System.out.println("Fruit: " + fruit);
        }

        // Conditional logic in streams using filter, map, and reduce.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers)
                        .filter(n -> n % 2 == 0) // Filter even numbers
                        .map(n -> n * 2) // Double the even numbers
                        .reduce(0, Integer::sum); // Sum them up

        System.out.println("Sum of doubled even numbers: " + sum);
    }
}
