package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
 * Next Greater Element
 * For each element, find the next element to its right that is greater.
 * Returns -1 if no such element exists.
 * Uses a monotonic decreasing stack.
 * Time: O(n)  Space: O(n)
 */
public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(nextGreater(arr))); // [5, 10, 10, -1, -1]

        int[] arr2 = {13, 7, 6, 12};
        System.out.println(Arrays.toString(nextGreater(arr2))); // [-1, 12, 12, -1]
    }
}
