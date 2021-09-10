package Recursion;
public  class rec {
    static boolean PathPossible(int arr1[][], boolean marker[][], int i, int j){
        if(arr1.length == i || arr1[0].length == j){
            return true;
        }
        if(i>=arr1.length || i<0){
            return false;
        }
        else if(j>= arr1[0].length || j<0){
            return false;
        }
        else if(marker[i][j] == true){
            return false;
        }
        if(arr1[i][j] == 1){
            marker[i][j] = true;

            if(PathPossible(arr1, marker, i-1,j) == true){
                return true;
            }
            if(PathPossible(arr1, marker, i+1,j) == true){
                return true;
            }
            if(PathPossible(arr1, marker, i,j-1) == true){
                return true;
            }
            if(PathPossible(arr1, marker, i,j+1) == true){
                return true;
            }
            marker[i][j] = false;
         }
         return false;
    }
    

    //----------------------------------------------------------------------------------- 
    // static boolean isPossible(int board[][], int row, int col){
    //     for(int i=0; i<=row; i++){
    //         if(board[i][col] == 1){
    //             return false;
    //         }
    //     }
    //     //left diagonal
    //     for(int i=row, j= col; i>=0 && j>=0; i--,j--){
    //         if(board[i][j] == 1){
    //             return false;
    //         }
    //     }
    //     //right diagonal
    //     for(int i=row, j=col; i>=0 && j<=3; i--, j++){
    //         if(board[i][j] == 1){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // static boolean fillNQueen(int board[][], int row, int QueenNum){
    //     if(row == 4){
    //         for(int i=0; i<4; i++){
    //             for(int j=0; j<4; j++){
    //                 System.out.print(board[i][j]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
        
    //     }
    //     for(int i=0; i<4; i++){
    //         if(isPossible(board, row, i)){
    //             board[row][i] = QueenNum;

    //             if(fillNQueen(board, row+1, QueenNum)){
    //                 return true;
    //             }
    //             else{
    //                 board[row][i] = 0;
    //             }
    //         }
             
    //     }
    //     return false;
    // }
    
    public static void main(String[] args) {
        int arr1[][] = {{1,0,1,0},
                        {1,1,0,0},
                        {0,1,1,0},
                        {0,0,1,0}}; 
        boolean marker[][] = new boolean[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                if(PathPossible(arr1,marker, i, j)){  
                    System.out.println("Yes, path is possible");
                }
                else{
                    System.out.println("No path possible");
                }
                   

            }
             
        }
        
         
        //=====================================================================
        // int board[][] = new int[4][4];
        // if(fillNQueen(board, 0, 1)){
        //     for(int i=0; i<4; i++){
        //         for(int j=0; j<4; j++){
        //             System.out.print(board[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
         }
        // else{
        //     System.out.println("No possible path");
        // }
    }
    
     

 