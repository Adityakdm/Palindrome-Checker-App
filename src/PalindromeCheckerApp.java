import java.util.*;

public class PalindromeCheckerApp {

    // ===== Reverse String Method =====
    public static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // ===== Stack Method =====
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ===== Deque Method =====
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // ===== Recursive Method =====
    public static boolean recursiveMethod(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursiveMethod(input, start + 1, end - 1);
    }

    // ===== Main =====
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to test performance: ");
        String input = scanner.nextLine();

        System.out.println("\n=== PERFORMANCE COMPARISON ===");

        // Reverse Method
        long start = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end = System.nanoTime();
        System.out.println("Reverse Method Result: " + r1 +
                " | Time: " + (end - start) + " ns");

        // Stack Method
        start = System.nanoTime();
        boolean r2 = stackMethod(input);
        end = System.nanoTime();
        System.out.println("Stack Method Result: " + r2 +
                " | Time: " + (end - start) + " ns");

        // Deque Method
        start = System.nanoTime();
        boolean r3 = dequeMethod(input);
        end = System.nanoTime();
        System.out.println("Deque Method Result: " + r3 +
                " | Time: " + (end - start) + " ns");

        // Recursive Method
        start = System.nanoTime();
        boolean r4 = recursiveMethod(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Method Result: " + r4 +
                " | Time: " + (end - start) + " ns");

        scanner.close();
    }
}