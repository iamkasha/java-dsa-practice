class Solution {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> s1Map = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0)+1);
        }

        if (s1.length() > s2.length()) return false;
        
        Map<Character, Integer> s2_Map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            s2_Map.put(s2.charAt(i), s2_Map.getOrDefault(s2.charAt(i), 0)+1);
        }

        if (s1Map.equals(s2_Map)) return true;

        for(int right = s1.length(); right < s2.length(); right++){
            s2_Map.put(s2.charAt(right), s2_Map.getOrDefault(s2.charAt(right), 0)+1);

            char leftChar = s2.charAt(right - s1.length());
            s2_Map.put(leftChar, s2_Map.get(leftChar)-1);

            if(s2_Map.get(leftChar) == 0){
                s2_Map.remove(leftChar);
            }
            if(s1Map.equals(s2_Map)){
                return true;
            }
        }
        return false;
    }
}