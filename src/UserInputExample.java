import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // User input example
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name:");
        String userName = myObj.nextLine(); // Read user input
        System.out.println("Hello, " + userName + "!"); // Output user input
        // nextBoolean()	Reads a boolean value from the user
        // nextByte()	    Reads a byte value from the user
        // nextDouble()	    Reads a double value from the user
        // nextFloat()	    Reads a float value from the user
        // nextInt()	    Reads a int value from the user
        // nextLine()	    Reads a String value from the user
        // nextLong()	    Reads a long value from the user
        // nextShort()	    Reads a short value from the user
        System.out.print("Enter your age: ");
        int userAge = myObj.nextInt();
        System.out.println("You are " + userAge + " years old!");
    }
}
