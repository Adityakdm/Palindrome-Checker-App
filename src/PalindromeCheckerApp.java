public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "level";   // You can change the word here
        String reversed = "";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("=======================================");
        System.out.println("Original String : " + original);

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result : The given string is a PALINDROME.");
        } else {
            System.out.println("Result : The given string is NOT a palindrome.");
        }

        System.out.println("Program Executed Successfully.");
    }
}