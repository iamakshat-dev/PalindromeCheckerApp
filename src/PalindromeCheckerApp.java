public class PalindromeCheckerApp{

    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // String to store reversed result
        String reversed = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}