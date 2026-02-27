import java.util.*;

public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome using two-pointer technique
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC10: Case-Insensitive & Space-Ignored Palindrome =====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Normalize string
        // Remove spaces and special characters using Regular Expression
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply palindrome logic
        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("Result: The given string is a Palindrome (Ignoring case & spaces).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}
