package binarysearch;

/*
 * LeetCode #162 — Find Peak Element
 * A peak element is greater than its neighbors. Find any peak index.
 * Assumes arr[-1] and arr[n] are -infinity.
 * Time: O(log n)  Space: O(1)
 */
public class FindPeakElement {

    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        System.out.println("Peak index: " + findPeak(arr1) + " (val=" + arr1[findPeak(arr1)] + ")"); // index 2, val 3

        int[] arr2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak index: " + findPeak(arr2) + " (val=" + arr2[findPeak(arr2)] + ")"); // index 5, val 6
    }
}
