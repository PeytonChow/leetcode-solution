package cn.neaghfoz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6};

        Permutations solution = new Permutations();
        System.out.println(solution.permute(a));
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        permIter(nums, 0, nums.length, result);

        return result;
    }

    void permIter(int[] subNums, int start, int end, List<List<Integer>> result) {
        if (start == end) {
            // Only one element
            List p = new ArrayList();
            for (int i = 0; i < end; i++) {
                p.add(subNums[i]);
            }
            result.add(p);
        } else {
            for (int i = start; i < end; i++) {
                swap(subNums, start, i);
                permIter(subNums, start + 1, end, result);
                swap(subNums, start, i);
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
