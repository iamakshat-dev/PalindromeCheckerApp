public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        boolean isPalindrome = word.equals(reversed);

        // Required Output Format
        System.out.println("Input text: " + word);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
