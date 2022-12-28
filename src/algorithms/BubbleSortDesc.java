package algorithms;

import java.util.Arrays;

public class BubbleSortDesc {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
