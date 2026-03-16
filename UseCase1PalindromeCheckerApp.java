public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Logic to reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if original and reversed strings are equal
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

    }
}
