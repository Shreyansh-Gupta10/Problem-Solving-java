package TopHundredCodes;

public class HCF {

    //sum of odd digits of a number
    // static void sumOddDig(int num){
    //     int sum = 0;
    //     String s = Integer.toString(num);
    //     for(int i=0; i<s.length(); i++){
    //         if(s.charAt(i)%2 ==1){
    //             sum+=Integer.parseInt(String.valueOf(s.charAt(i)));  //s.charAt(i)-49+1;
                
    //             System.out.println(s.charAt(i));
    //         }
    //     }
    //     System.out.print(sum);

        //==========================================

        //for gcd of 3 numbers
        // int min = Math.min(num1, Math.min(num2, num3));
        // int i;
        // for(i=min; i>0; i--){
        //     if(num1%i==0 && num2%i==0 && num3%i==0){
        //         break;
        //     }
        // }
        // System.out.println(i);

        //============================================================
        
        // for gcd of 2 numbers.
        // while(num1%num2 != 0){
        //     int n=num1%num2;
        //     num1=num2;
        //     num2 = n;
        // }
        // System.out.println(num2);

        //=============================================================================

        // static void transposeMat(int mat[][]){
        //     int transpose[][] = new int[mat.length][mat[0].length];
        //     for(int i=0; i<mat.length; i++){
        //         for(int j=0; j<mat[0].length; j++){
        //             transpose[i][j]=mat[j][i];
        //         }
        //     }
        //     System.out.println("Transpose of a matrix is: ");
        //     for(int i=0; i<transpose.length; i++){
        //         for(int j=0; j<transpose[0].length; j++){
        //             System.out.print(transpose[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        // }

        //============================================================
        static void maxInRow(int arr[][]){
            for(int i=0; i<arr.length; i++){
                int max = arr[i][0];
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j] > max){
                        max = arr[i][j];
                    }
                }
                System.out.print(max+" ");
            }
        }
    
    public static void main(String[] args) {
        // int n1 = 12;
        // int n2 = 16;
        // int n3 = 22;
        // gcd(n1,n2,n3);
        //==============================================
        // int n=135794;
        // sumOddDig(n);
        //===============================================
        // int mat[][] = {{1,2,3},
        //                {4,5,6},
        //                {7,8,9}};
        //                System.out.println("Original Matrix is: ");
        // for(int i=0; i<mat.length; i++){
        //     for(int j=0; j<mat[0].length; j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // transposeMat(mat);
        //=====================================================

        int arr[][] = {{9,10,5},
                       {7,1,11},
                       {15,8,6}};
        maxInRow(arr);
        

    }
    
}
