public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original input
        String input = "radar";

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Display result (same format as your image)
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}