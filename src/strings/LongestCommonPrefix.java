package strings;

import java.util.Arrays;

/*
 * LeetCode #14 — Longest Common Prefix
 * Find the longest common prefix string among an array of strings.
 * Approach: sort the array; compare only the first and last strings.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) break;
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // "fl"
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));    // ""
    }
}
