package leetcode;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome_Number_2 {

    public static void main(String[] args) {

        System.out.println(isPalindrome( 12300));


    }

    public static boolean isPalindrome(int x) {
        String s = (Integer.valueOf(Math.abs(x))).toString();

        String[] s3 = s.split("");

        StringBuilder sb = new StringBuilder();
        for (int i = s3.length - 1; i >= 0; i--) {
            sb.append(s3[i]);
        }

        String s2 = sb.toString();
        Pattern p = Pattern.compile("[0]+");
        Matcher m = p.matcher(s2);

        if (s.equals(s2) || m.lookingAt()) return true;
        return false;

    }
}
