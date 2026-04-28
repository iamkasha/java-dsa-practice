package binarysearch;

/*
 * Binary Search
 * Search for a target in a sorted array by repeatedly halving the search space.
 * Time: O(log n)  Space: O(1)
 */
public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45};
        System.out.println(search(arr, 23));  // 5
        System.out.println(search(arr, 10));  // -1
    }
}
