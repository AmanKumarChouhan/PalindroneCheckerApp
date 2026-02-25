// Class acts as a container for program logic
public class PalindroneCheckerApp {

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // Hardcoded string (Data Structure: String)
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Loop (for loop) - reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String Concatenation
        }

        // Compare original and reversed using equals() method
        if (original.equals(reversed)) {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        // Program exits after execution
    }
}