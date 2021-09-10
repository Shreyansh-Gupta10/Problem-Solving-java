package Recursion;

public class KnightQueen {
    
    static boolean fillKnight(int chessBoard[][],int xoption[], int yoption[], int x, int y, int knight){
        if(knight == 65){
            for(int i=0; i<8; i++){
                for(int j=0; j<8; j++){
                    System.out.print(chessBoard[i][j]+"\t");
                }
            System.out.println();
            }   
            System.out.println();
            return true;
        }
        if(x<0 || y<0 || x>7 || y>7 || chessBoard[x][y] != 0){
           return false;
        }
        else{
              
            for(int i=0; i<8; i++){ 
                chessBoard[x][y] = knight;         
                if(fillKnight(chessBoard, xoption, yoption, x+xoption[i], y+yoption[i], knight+1)==true){
                    // return true;
                }
                else{
                    chessBoard[x][y] = 0;
                }
            }
            return false;    
        }  
    }
    public static void main(String[] args) {
        int chessBoard[][] = new int[8][8];
        int xoption[] = {2,1,-1,-2,-2,-1,1,2};
        int yoption[] = {1,2,2,1,-1,-2,-2,-1}   ;
        boolean flag = fillKnight(chessBoard, xoption, yoption, 0,0, 1);

        // if(flag == true){
        //     for(int i=0; i<8; i++){
        //         for(int j=0; j<8; j++){
        //             System.out.print(chessBoard[i][j]+"\t");
        //         }
        //         System.out.println();
        //     }   
        // }
    }
}
