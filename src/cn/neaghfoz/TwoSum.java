package cn.neaghfoz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution2 solution = new Solution2();

        System.out.println(Arrays.toString(solution.twoSum(nums, 26)));
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        // key->target, value->index
        Map<Integer, Integer> targetMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            targetMap.put(target - nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            Integer index = targetMap.get(nums[j]);

            if (index != null && index != j) {
                return (index < j) ? new int[]{index, j} : new int[]{j, index};
            }
        }

        return null;
    }
}
