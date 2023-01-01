package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_3 {
    public static void main(String[] args) {
        int[] a = new int[] {4,8,9,2,3,7,6};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }

    private static int[] twoSum (int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }

        return new int[0];
    }
}
