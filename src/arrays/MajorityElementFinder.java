package arrays;

import java.util.Arrays;

/*
 * LeetCode #169 — Majority Element
 * Find the element that appears more than n/2 times.
 * Approach: sort the array; the majority element always occupies the middle index.
 */
public class MajorityElementFinder {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));                      // 3
        System.out.println(majorityElement(new int[]{1, 2, 3, 8, 3, 0, 3, 4, 4, 4, 4})); // 4
    }
}
