package TopHundredCodes;

import java.util.Scanner;

public class MatrixMul {
    static void matrixMultiply(int r1, int c1, int mat1[][], int r2, int c2, int mat2[][]){
        // int i,j,k;
        int mat3[][] = new int[r1][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<r2; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.OfRows of first Matrix: ");
        int row1 = sc.nextInt();
        System.out.println("Enter no.OfCols of first Matrix: ");
        int col1 = sc.nextInt();

        System.out.println("Enter Matrix1: ");
        int Matrix1[][] = new int[row1][col1]; 
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                Matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no.OfRows of second Matrix: ");
        int row2 = sc.nextInt();
        System.out.println("Enter no.Ofcols of second Matrix: ");
        int col2 = sc.nextInt();

        System.out.println("Enter Matrix2: ");
        int Matrix2[][] = new int[row2][col2];
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                Matrix2[i][j] = sc.nextInt();
            }
        }

        matrixMultiply(row1, col1, Matrix1, row2, col2, Matrix2);
        

    }
}
