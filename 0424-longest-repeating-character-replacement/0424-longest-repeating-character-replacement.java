class Solution {
    public int characterReplacement(String s, int k) {
        
        int left=0;
        int result = 0;
        int maxLen = 0;

        int arr[] = new int[26];

        for(int right=0; right<s.length(); right++){

            arr[s.charAt(right)-'A']++;
            maxLen = Math.max(maxLen, arr[s.charAt(right)-'A']);

            int window = right - left + 1;
            if(window - maxLen > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}