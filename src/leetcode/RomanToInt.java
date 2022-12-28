package leetcode;

public class RomanToInt {
    public static void main(String[] args) {

//        String s = "IV";
//        int result = 0;
//        if (s.contains("IV")) {
//            result += 4;
//        }
//        System.out.println(result);

        romanToInt("IV");
    }

    public static int romanToInt(String s) {

        int result = 0;

        if (s.equals("IV")) {
            result = result + 4;
        }

        if (s.contains("VI")) {
            result += 6;
        }

        if (s.contains("IX")) {
            result += 9;
        }

        return result;

//        if (s.length() >= 1 && s.length() <= 15) {
//            int countI = 0;//1
//            int countV = 0;//5
//            int countX = 0;//10
//            int countL = 0;//50
//            int countC = 0;//100
//            int countD = 0;//500
//            int countM = 0;//1000
//            String[] s2 = s.split("");
//            for (int i = 0; i < s2.length; i++) {
//                if (s2[i].contains("I")) countI++;
//                if (s2[i].contains("V")) countV++;
//                if (s2[i].contains("X")) countX++;
//                if (s2[i].equals("L")) countL++;
//                if (s2[i].equals("C")) countC++;
//                if (s2[i].equals("D")) countD++;
//                if (s2[i].equals("M")) countM++;
//            }
//
//            if (countI <= 3 && countV == 0 && countX == 0) {
//                result += countI;
//            }
//
//            if (countV >= 1 && countI != 1) {
//                result += countV * 5;
//            }
//
//            if (countX >= 1 && countI != 1) {
//                result += countX * 10;
//            }
//
//        }
//        return result;
    }
}
