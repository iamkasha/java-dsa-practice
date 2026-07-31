class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> s_map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!s_map.containsKey(c) || s_map.get(c) == 0) {
                return false;
            }
            s_map.put(c, s_map.get(c) - 1);
        }
        return true;
    }
}