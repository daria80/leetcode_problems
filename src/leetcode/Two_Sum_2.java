package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15},9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];

            if(map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
                return new int[] {i, map.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
