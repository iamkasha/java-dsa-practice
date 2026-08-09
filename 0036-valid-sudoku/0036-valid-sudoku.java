class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> r[] = new HashSet[9];
        Set<Character> c[] = new HashSet[9];
        Set<Character> box[] = new HashSet[9];
        for(int i=0; i<9; i++){
            r[i] = new HashSet<>();
            c[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int boxIndex = (i/3) * 3 + (j/3);
                if(r[i].contains(board[i][j]) || c[j].contains(board[i][j]) || box[boxIndex].contains(board[i][j])){
                    return false;
                }
                r[i].add(board[i][j]);
                c[j].add(board[i][j]);
                box[boxIndex].add(board[i][j]);
            }
        }
        return true;
    }
}