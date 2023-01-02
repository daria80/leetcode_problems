package leetcode;

public class Palindrome_Number_3 {
    public static void main(String[] args) {
        int x = 123;
        int y = 13131;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0, copy = x;
        while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
        }
        return reverse == x;
    }
}
