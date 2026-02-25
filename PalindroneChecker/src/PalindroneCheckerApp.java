// Class acts as a container for program logic
public class PalindroneCheckerApp {

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // Hardcoded string
        String input = "radar";

        // Convert string to character array (Data Structure: char[])
        char[] characters = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        // Program exits after execution
    }
}