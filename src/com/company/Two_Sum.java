package com.company;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums1 = {2, 11, 7, 15};
        int target1 = 9;
        int[] arr = Two_Sum.twoSum(nums1, target1);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[] {i,j};
            }
        }
        return null;
    }
}

