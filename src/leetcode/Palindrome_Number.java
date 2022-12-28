package leetcode;

import java.util.Arrays;

public class Palindrome_Number {
    public static void main(String[] args) {

        int x = 121;
        Integer x3 = x;
        String s2 = x3.toString();
        System.out.println(s2.length());
        System.out.println("//////");
        int [] n = {1,2,1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            System.out.println(sb.append(n[i]));

        }
        String s = sb.toString();
        int x2 =  Integer.valueOf(s).intValue();
        System.out.println(x2);
        if(x2 == x) {
            System.out.println("Наконец-то!!!");
        }



    }
}
