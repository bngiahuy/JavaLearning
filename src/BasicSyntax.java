import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicSyntax {
    public static void main(String[] args) {
        // Declare variables
        int a = 5;
        float b = 3.14f;
        double c = 2.71828;
        long dLong = 100000L;
        char d = 'A';
        boolean e = true;
        String f = "Hello, World!";

        // Constant variable
        final int CONSTANT_VAR = 10;
        // CONSTANT_VAR = 11; // This line will cause a compilation error because CONSTANT_VAR is final

        // Print the variables
        System.out.println("Integer: " + a);

        // Parse from int to float
        System.out.println("Float: " + (float) a);

        // Parse from float to double
        System.out.println("Double: " + (double) b);

        // Parse from char to int
        char charToInt = '5';
        System.out.println("Char to Int: " + (charToInt - '0'));

        // Parse from string to int
        String strToInt = "123";
        int parsedInt = Integer.parseInt(strToInt);
        System.out.println("String to Int: " + parsedInt);

        // Parse from string to float
        String strToFloat = "3.14";
        float parsedFloat = Float.parseFloat(strToFloat);
        System.out.println("String to Float: " + parsedFloat);

        // Parse from string to double
        String strToDouble = "2.71828";
        double parsedDouble = Double.parseDouble(strToDouble);
        System.out.println("String to Double: " + parsedDouble);

        // Parse from number to string
        int intToString = 456;
        String convertedString = Integer.toString(intToString);

        // Array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
    }
}