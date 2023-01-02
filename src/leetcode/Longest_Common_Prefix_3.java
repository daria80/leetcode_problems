package leetcode;

public class Longest_Common_Prefix_3 {
    public static void main(String[] args) {
        System.out.println(prefix(new String[]{"flower", "flow", "flight"}));
    }

    private static String prefix(String[] str) {
        if (str.length == 0) return "";

        int length = str[0].length();

        for (int i = 1; i < str.length; i++) {
            length = Math.min(length, str[i].length());

            for (int j = 0; j < length; j++) {
                char c = str[0].charAt(j);
                char d = str[i].charAt(j);

                if (c != d) {
                    length = j;
                    break;
                }
            }
        }
        return str[0].substring(0, length);
    }
}
