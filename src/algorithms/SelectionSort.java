package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[] {5,4,3,2,1};

        for (int step = 0; step < array.length; step++) {
            System.out.println(Arrays.toString(array));
            int index = min(array,step);
            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    private static int min(int[] array, int start) {
        int minValue = array[start];
        int minValueIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }
}
