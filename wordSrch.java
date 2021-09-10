package Recursion;

public class wordSrch {
    static boolean searchWord(char board[][], boolean boardMarker[][], String word, int index, int i, int j){
        if(word.length() == index){
            return true;
        }
        if(i>= board.length || i<0){
            return false;
        }
        else if(j>= board[0].length || j<0){
            return false;
        }
        else if(boardMarker[i][j] == true){
            return false;
        }
        
        if(board[i][j] == word.charAt(index)){
            boardMarker[i][j] = true;
            
            if(searchWord(board, boardMarker, word, index+1, i-1,j) == true){
                return true;
            }
            if(searchWord(board, boardMarker, word, index+1, i+1,j) == true){
                return true;
            }
            if(searchWord(board, boardMarker, word, index+1, i,j-1) == true){
                return true;
            }
            if(searchWord(board, boardMarker, word, index+1, i,j+1) == true){
                return true;
            }
            boardMarker[i][j] = false;
            
        }
        return false;
    }
    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean boardMarker[][] = new boolean[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(searchWord(board, boardMarker, word, 0, i, j)){
                    System.out.println("true");
                }
            }
        }
        System.out.println("false");
        
    }
         
        
    }
    

