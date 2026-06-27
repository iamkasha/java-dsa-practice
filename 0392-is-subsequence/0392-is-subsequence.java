class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int i=0;
        int j=0;
        while(j <= t.length()-1){
            if(i <= s.length()-1 && s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i > s.length() - 1 ? true : false;
    }
}