import java.util.Stack;   // Stack class

// Class acts as a container for program logic
public class PalindroneCheckerApp {

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Data Structure: Stack
        Stack<Character> stack = new Stack<>();

        // Push Operation - Insert characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop Operation - Remove characters and compare
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();  // removes last inserted character

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        // Program exits after execution
    }
}