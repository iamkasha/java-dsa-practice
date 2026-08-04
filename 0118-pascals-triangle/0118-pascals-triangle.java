class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();

        for(int r = 0; r<numRows; r++){
            List<Integer> curRow = new ArrayList<>();
            for(int c = 0; c<=r; c++){
                if( c == 0 || c == r){
                    curRow.add(1);
                } else{
                    curRow.add(prevRow.get(c-1) + prevRow.get(c)); 
                }
            }
            result.add(curRow);
            prevRow = curRow;
        }
        return result;
    }
}