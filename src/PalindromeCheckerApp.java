public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("=======================================");
        System.out.println("Original Input : " + input);

        // Step 1: Normalize String
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")  // Remove spaces & special characters using regex
                .toLowerCase();                  // Convert to lowercase

        System.out.println("Normalized Input : " + normalized);

        // Step 2: Apply Two-Pointer Logic
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print Result
        if (isPalindrome) {
            System.out.println("Result : The given string is a PALINDROME.");
        } else {
            System.out.println("Result : The given string is NOT a palindrome.");
        }

        System.out.println("Program Executed Successfully.");
    }
}