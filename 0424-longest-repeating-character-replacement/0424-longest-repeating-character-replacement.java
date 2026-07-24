class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int maxFreq = 0;
        int result = 0;
        int left = 0;

        for(int right=0; right<s.length(); right++){

            arr[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;

            if(windowSize - maxFreq > k){
                arr[s.charAt(left)- 'A']--;
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}