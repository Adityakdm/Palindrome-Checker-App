public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("=======================================");
        System.out.println("Hardcoded Word : " + word);

        // Reverse the string manually
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Conditional Statement (if-else)
        if (word.equals(reversed)) {
            System.out.println("Result : The given string is a PALINDROME.");
        } else {
            System.out.println("Result : The given string is NOT a palindrome.");
        }

        System.out.println("Program Executed Successfully.");
    }
}