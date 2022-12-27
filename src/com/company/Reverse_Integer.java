package com.company;

public class Reverse_Integer {
    public static void main(String[] args) {

        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int pop = x % 10; // 3 2 1
            x = x / 10; // 12 1 0
            if(result > Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }
            if(result < Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }
            result = result * 10 + pop; // 3 32 321
        }
        return result;
    }
}
