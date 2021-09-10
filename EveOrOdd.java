package TopHundredCodes;

import java.util.Scanner;

public class EveOrOdd {
//Prime number between starting and ending range
    static void Prime(int n1, int n2){
        for(int i=n1; i<=n2; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    count += 1;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }

        }
        // greater btw 2 numbers.
        // if(n1>n2){
        //     System.out.println(n1+" is greater");
        // }
        // else if(n2>n1){
        //     System.out.println(n2+" is greater");
        // }
        // else{
        //     System.out.println("Both are equal");
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
         
        int n2 = sc.nextInt();
        Prime(n1, n2);
        sc.close();
//==========================================================================
        // to check wheather a number is odd or even.
    //     Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int num = sc.nextInt();
    // if(num%2 == 0){
    //     System.out.println("Even number");
    // }
    // else{
    //     System.out.println("Odd number");
    // } 
    // sc.close();
    //-------------------------------------------------------------

    //Sum of N natural numbers.

    // System.out.println("Enter n: ");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum;
    // int sum2=0;
    // sum = n*(n+1)/2; // with formula(without using loop)

    // // with for loop
    // for(int i=1; i<=n; i++){
    //     sum2+=i;
    // }
    // System.out.println("Sum of first "+ n +" natural numbers is: "+ sum);
    // System.out.println("Sum of first "+ n +" natural numbers is: "+ sum2);
    }
     
}
