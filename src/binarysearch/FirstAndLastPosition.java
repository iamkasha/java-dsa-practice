package binarysearch;

import java.util.Arrays;

/*
 * LeetCode #34 — Find First and Last Position of Element in Sorted Array
 * Find the starting and ending index of a target in a sorted array.
 * Returns [-1, -1] if not found.
 * Time: O(log n)  Space: O(1)
 */
public class FirstAndLastPosition {

    public static int[] searchRange(int[] arr, int target) {
        return new int[]{firstPosition(arr, target), lastPosition(arr, target)};
    }

    private static int firstPosition(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { result = mid; right = mid - 1; }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }

    private static int lastPosition(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { result = mid; left = mid + 1; }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))); // [3, 4]
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))); // [-1, -1]
    }
}
