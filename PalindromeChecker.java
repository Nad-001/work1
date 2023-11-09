public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.checkPalindrome(12321); // calling the checkPalindrome method
    }
    
    public void checkPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}