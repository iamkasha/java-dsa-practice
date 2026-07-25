class Solution {
    public int maxVowels(String s, int k) {
        
        int maxLen = 0;
        int right = 0;
        int count = 0;

        while(right < k){
            if(isVowel(s.charAt(right))){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            right++;
        }

        while(right < s.length()){

            if(isVowel(s.charAt(right))){
                count++;
            }

            if(isVowel(s.charAt(right - k))){
                count--;
            }
            right++;
            maxLen = Math.max(maxLen, count);

        }
        return maxLen;
    }

    private static boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}