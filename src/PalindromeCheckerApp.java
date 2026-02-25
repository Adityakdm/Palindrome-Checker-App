import java.util.*;

public class PalindromeCheckerApp {

    // ===== Strategy Interface =====
    interface PalindromeStrategy {
        boolean checkPalindrome(String input);
    }

    // ===== Stack Strategy =====
    static class StackStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {

            String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                    .toLowerCase();

            Stack<Character> stack = new Stack<>();

            for (char ch : normalized.toCharArray()) {
                stack.push(ch);
            }

            for (char ch : normalized.toCharArray()) {
                if (ch != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // ===== Deque Strategy =====
    static class DequeStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {

            String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                    .toLowerCase();

            Deque<Character> deque = new LinkedList<>();

            for (char ch : normalized.toCharArray()) {
                deque.addLast(ch);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    // ===== Context Class =====
    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.checkPalindrome(input);
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("=======================================");
        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if (result) {
            System.out.println("Result : The given string is a PALINDROME.");
        } else {
            System.out.println("Result : The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}