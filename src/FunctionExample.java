public class FunctionExample {
    private static int add(int a, int b) {
        return a + b; // Returns the sum of two integers
    }

    private static void printMessage(String message) {
        System.out.println(message); // Prints a message to the console
    }

    private static void greetUser(String name) {
        System.out.println("Nice to meet you, " + name + "!"); // Greets the user with their name
    }

    private static int getCurrentYear() {
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    }

    static void printNothing() {
        System.out.println("This is the output of `printNothing`"); // Prints any message to the console
    }

    public static void main(String[] args) {
        // Example of a simple function
        int result = add(5, 10);
        System.out.println("Result of add(5, 10): " + result);

        // Example of a function with no return value
        printMessage("Hello, World!");

        // Example of a function with parameters and no return value
        greetUser("Albert Einstein");

        // Example of a function with no parameters that returns a value
        int currentYear = getCurrentYear();
        System.out.println("Current year is: " + currentYear);

        printNothing();
    }
}
