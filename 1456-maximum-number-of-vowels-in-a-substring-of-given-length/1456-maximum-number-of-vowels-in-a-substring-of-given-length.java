class Solution {
    public int maxVowels(String s, int k) {
        
        //Re-solve attempt
        int right = 0;
        int count = 0;

        for(right = 0; right<k; right++){
            if(isVowel(s.charAt(right))){
                count++;
            }
        }

        int maxLen = count;

        while(right < s.length()){

            if(isVowel(s.charAt(right))){
                count++;
            }

            if(isVowel(s.charAt(right-k))){
                count--;
            }

            maxLen = Math.max(maxLen, count);
            right++;
        }
        return maxLen;
    }

    private static boolean isVowel(char c){

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        } else {
            return false;
        }

    }
}