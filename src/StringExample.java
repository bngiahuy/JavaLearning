public class StringExample {
    public static void main(String[] a) {
        String s = "Hello, World!";

        // Get string length
        int length = s.length();
        System.out.println("Length of the string: " + length);

        // Get character at index 7
        int index = 7;
        if (index < 0 || index >= s.length()) {
            System.out.println("Index out of bounds");
        } else {
            char c = s.charAt(index);
            System.out.println("Character at index " + index + ": " + c);
        }

        // Get substring from index 7 to 12
        int from = 7, to = 12;
        if (from < 0 || to > s.length() || from >= to) {
            System.out.println("Invalid substring indices");
        } else {
            String sub = s.substring(from, to);
            System.out.println("Substring from index " + from + " to " + to + ": " + sub);
        }

        // Check if the string contains "World"
        String subStringContains = "World";
        boolean contains = s.contains(subStringContains);
        System.out.println("Does the string contain \"" + subStringContains + "\": " + contains);
        // Start with "Hello"
        String startsWith = "Hello";
        boolean starts = s.startsWith(startsWith);
        System.out.println("Does the string start with \"" + startsWith + "\": " + starts);
        // End with "?"
        String endsWith = "?";
        boolean ends = s.endsWith(endsWith);
        System.out.println("Does the string end with \"" + endsWith + "\": " + ends);

        // Index of
        String searchString = "World";
        int indexOf = s.indexOf(searchString);
        if (indexOf != -1) {
            System.out.println("Index of \"" + searchString + "\": " + indexOf);
        } else {
            System.out.println("\"" + searchString + "\" not found in the string");
        }

        // Concatenation
        String additionalString = " How are you?";
        String concatenated = s.concat(additionalString);
        System.out.println("Concatenated string: " + concatenated);

        // Compare strings
        String anotherString = "Hello, World!";
        boolean areEqual = s.equals(anotherString);
        boolean areCompareTo = s.compareTo(anotherString) == 0;
        System.out.println("Are the strings equal? " + areEqual);
        System.out.println("CompareTo result: " + areCompareTo);

        // Convert to uppercase and lowercase
        String upperCase = s.toUpperCase();
        String lowerCase = s.toLowerCase();
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);

        // Replace characters
        String replacedString = s.replace('o', '0');
        System.out.println("String after replacing 'o' with '0': " + replacedString);

        // Trim
        String stringWithSpaces = "   Hello, World!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // Matches Regex
        String regex = "Hello,.*";
        boolean matches = s.matches(regex);
        System.out.println("Does the string match regex \"" + regex + "\": " + matches);

        // Split the string
        String[] splitString = s.split(", ");
        System.out.println("Split string:");
        for (String part : splitString) {
            System.out.println(part);
        }

        // Format a string
        String name = "Alice";
        int age = 30;
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println("Formatted string: " + formattedString);

        // HashCode
        int hashCode = s.hashCode();
        System.out.println("Hash code of the string: " + hashCode);
    }
}