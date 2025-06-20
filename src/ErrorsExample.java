public class ErrorsExample {
    // Compile-Time Error: Detected by the compiler. Prevents code from running.
    // Runtime Error: Occurs while the program is running. Often causes crashes.
    // Logical Error: Code runs but gives incorrect results. Hardest to find.

    public static void main(String[] args) {
        // Example of a compile-time error
        // Uncommenting the next line will cause a compile-time error
        // int x = "Hello"; // Type mismatch: cannot convert from String to int

        // Example of a runtime error
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught a runtime error: " + e.getMessage());
        }

        // Example of a logical error
        int a = 5;
        int b = 10;
        // The intention is to add a and b, but we mistakenly subtract them
        int result = a - b; // Logical error: should be a + b
        System.out.println("Result of logical error: " + result); // Outputs -5 instead of 15

        // Assert statement example
        // Tip: Add option `-ea` or `-enableassertions` to enable assertions when running this program
        assert result == 15 : "Logical error detected! Expected 15 but got " + result;
    }

}
