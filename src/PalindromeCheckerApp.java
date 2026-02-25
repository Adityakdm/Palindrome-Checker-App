public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";   // Change value to test
        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("=======================================");
        System.out.println("Input String : " + input);

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result : The given string is a PALINDROME.");
        } else {
            System.out.println("Result : The given string is NOT a palindrome.");
        }

        System.out.println("Program Executed Successfully.");
    }
}