package leetcode;

public class Longest_Common_Prefix_ {
    public static void main(String[] args) {
        String[] strs = {"abcde", "abcdef", "abcde"};

        lcp(strs);
        System.out.println(lcp(strs));
    }

    public static String lcp(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String s = strs[0];

        for(int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(s) != 0) {
                s = s.substring(0,s.length() - 1);
                if(s.isEmpty()) return "";
            }
        }
        return s;
    }
}
