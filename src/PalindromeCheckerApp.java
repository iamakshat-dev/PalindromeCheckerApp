import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";

        // Create Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Pop from stack and compare
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result (matching your format)
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}