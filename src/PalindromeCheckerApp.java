import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);   // Add to rear
        }

        boolean isPalindrome = true;

        // Compare front and rear until one or zero elements remain
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear  = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}