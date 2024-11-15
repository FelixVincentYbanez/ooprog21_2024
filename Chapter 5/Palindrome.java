import java.util.Scanner;

public class PalindromeChecker{

    public static boolean isPalindrome(String input) {
        
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        if (input.length() <= 1) {
            return true;
        }
        
        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        }
        
        return isPalindrome(input.substring(1, input.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}
