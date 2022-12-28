package algorithms;

public class FindingTheMinimumElementOfAnArray {
    public static void main(String[] args) {

        int[] array = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int minValue = array[0];
        int minValueIndex = 0;

        for(int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }
        System.out.println("минимальное значение: " + minValue + " \nпод индексом: " + minValueIndex);
    }
}
