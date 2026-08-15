class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //Resolve attempt
        Set<Character> rowSet[] = new Set[9];
        Set<Character> colSet[] = new Set[9];
        Set<Character> box[] = new Set[9];

        for(int i=0; i<9; i++){
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int boxIndex = i/3 * 3 + j/3;
                if(rowSet[i].contains(board[i][j]) || colSet[j].contains(board[i][j]) || box[boxIndex].contains(board[i][j])){
                    return false;
                }
                rowSet[i].add(board[i][j]);
                colSet[j].add(board[i][j]);
                box[boxIndex].add(board[i][j]);
            }

        }
        return true;
    }
}