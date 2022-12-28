package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortingAsc {
    public static void main(String[] args) {
        int[] array = new int[] {5,4,3,2,1};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
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
