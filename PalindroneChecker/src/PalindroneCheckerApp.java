import java.util.Scanner;

// Class acts as a container for application logic
public class PalindroneCheckerApp {

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // ---- UC1 : Startup Display ----
        System.out.println("====================================");
        System.out.println("     Welcome to Palindrone Checker");
        System.out.println("====================================");

        System.out.println("Application Name : Palindrone Checker");
        System.out.println("Version          : 1.0.0");
        System.out.println("------------------------------------");

        // ---- UC2 : Palindrome Logic ----
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = processedInput.length() - 1; i >= 0; i--) {
            reversed += processedInput.charAt(i);
        }

        // Check palindrome
        if (processedInput.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome ❌");
        }

        System.out.println("------------------------------------");
        System.out.println("Application Ended.");

        scanner.close();
    }
}