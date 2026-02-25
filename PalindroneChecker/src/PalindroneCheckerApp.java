import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

// Class acts as a container for program logic
public class PalindroneCheckerApp{

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // Hardcoded string
        String input = "level";

        // Data Structures
        Stack<Character> stack = new Stack<>();          // LIFO
        Queue<Character> queue = new LinkedList<>();     // FIFO

        // Push into stack and Enqueue into queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);       // LIFO
            queue.add(ch);        // FIFO (enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) vs pop (stack)
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();     // LIFO removal
            char fromQueue = queue.remove();  // FIFO removal (dequeue)

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Result : It is NOT a Palindrome.");
        }

        // Program exits
    }
}