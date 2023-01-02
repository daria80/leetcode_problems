package leetcode;

public class Longest_Common_Prefix_2 {
    public static void main(String[] args) {
        System.out.println(prefix(new String[]{"flower", "fly", "flight"}));
    }

    private static String prefix(String[] str) {
        String s = str[0];

        for(int i = 0; i < str.length; i++) {
            while (s.indexOf(str[i])!= 0) {
                s = s.substring(0, s.length() - 1);
                if(s.isEmpty()) return "";
            }
        }
        return s;
    }
}
