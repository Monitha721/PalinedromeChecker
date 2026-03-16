import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // ---------------- Stack Approach ----------------
    public static boolean stackPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
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

    // ---------------- Deque Approach ----------------
    public static boolean dequePalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // ---------------- Two Pointer Approach ----------------
    public static boolean twoPointerPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC13: Performance Comparison =====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Stack timing
        long start1 = System.nanoTime();
        boolean result1 = stackPalindrome(input);
        long end1 = System.nanoTime();

        // Deque timing
        long start2 = System.nanoTime();
        boolean result2 = dequePalindrome(input);
        long end2 = System.nanoTime();

        // Two Pointer timing
        long start3 = System.nanoTime();
        boolean result3 = twoPointerPalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Stack Approach: " + result1 + 
                           " | Time: " + (end1 - start1) + " ns");

        System.out.println("Deque Approach: " + result2 + 
                           " | Time: " + (end2 - start2) + " ns");

        System.out.println("Two Pointer Approach: " + result3 + 
                           " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}
