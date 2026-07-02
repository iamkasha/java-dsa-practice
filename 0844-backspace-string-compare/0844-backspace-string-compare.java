class Solution {
    public boolean backspaceCompare(String s, String t) {       
        int s_index = s.length()-1;
        int t_index = t.length()-1; 
        while(s_index >= 0 || t_index >= 0){
            s_index = getValidChar(s_index, s);
            t_index = getValidChar(t_index, t);

            if(s_index < 0 && t_index < 0){
               return true; 
            }
            if(s_index < 0 || t_index < 0){
               return false; 
            }

            if(s.charAt(s_index) != t.charAt(t_index)){
                return false;
            }
            s_index--;
            t_index--;
        }
        return true;
    }

    private static int getValidChar(int index, String str){
        int skip = 0;
        while(index >= 0){
            if(str.charAt(index) == '#'){
                skip++;
                index--;
            } else if(skip > 0){
                skip--;
                index--;
            } else {
                break;
            }
        }
        return index;
    }
}