class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int i = s.length()-1;
        int j = t.length()-1;

        while(i >= 0 || j >= 0){

            i = getValidChar(i, s);

            j = getValidChar(j, t);

            if(i < 0 && j < 0){
                return true;
            }

            if(i < 0 || j < 0){
                return false;
            }

            if(s.charAt(i) != t.charAt(j)){
                return false;
            }

            i--;
            j--;
        }
        return true;
    }

    private int getValidChar(int index, String str){

        int skipCounter = 0;

        while(index >= 0){
            if(str.charAt(index) == '#'){
                skipCounter++;
                index--;
            } else if (skipCounter > 0){
                skipCounter--;
                index--;
            } else{
                break;
            }
        }
        return index;
    }
}