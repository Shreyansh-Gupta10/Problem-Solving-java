package TopHundredCodes;

import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong {
    // static void Armstrong(int num){
    //     int sum=0;
    //     int rem;
    //     int n=num;
    //     while(n!=0){
    //         rem = n%10;
    //         sum = sum+(rem*rem*rem);
    //         n = n/10;
    //     }
    //     if(sum == num){
    //         System.out.println("Armstrong no");
    //     }
    //     else{
    //         System.out.println("not an Armstrong no.");
    //     }
    // }

    // static void ArmstrongRange(int start, int end){
    //     int sum=0,n;
    //     int rem;
    //     for(int i=start; i<=end; i++){
    //         n=i;
    //         sum=0;
    //         while(n!=0){
    //             rem = n%10;
    //             sum = sum+(rem*rem*rem);
    //             n = n/10;
    //         }
    //         if(sum == i){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }

    //==============================================================
    // static void Fibonacci(int n){
    //     if(n>0){
    //         int a=0, b=1, c;
    //         ArrayList<Integer> list = new ArrayList<Integer>();
    //         list.add(a);
    //         list.add(b);
    //         while(b<=n){
    //             c = a+b;
    //             if(c<=n){
    //                 list.add(c);
    //             }
    //             a=b;
    //             b=c;
    //         }
    //         System.out.println(list);
            
    //     }
    //     else{
    //         System.out.println("Invalid Input");
    //     }
    // }

    //===================================================
    //Power
    // static void power(int n, int p){
    //     int ans=1;
    //     while(p>0){
    //         ans = ans*n;
    //         p--;
    //     }
    //     System.out.println( ans+" ");
    // }
    
    //==========================================================
    // static void factor(int n){
    //     for(int i=1; i<=n; i++){
    //         if(n%i==0){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }
    //==========================================================

    // static void strongNumber(int n){
    //     int sum=0;
    //     int rem;
    //     int num=n;
    //     while(num!=0){
    //         rem = num%10;
    //         int fact = 1;
    //         for(int i=rem; i>0; i--){
    //             fact = fact*i;
    //         }
    //         sum+=fact;
    //         num=num/10;
    //     }
    //     if(sum==n){
    //         System.out.println("Strong Number");
    //     }
    //     else{
    //         System.out.println("Not a Strong Number");
    //     }
    // }

    //=============================================================
    //Perfect Number
    // static void PerfectNumber(int n){
    //     int sum=0;
    //     for(int i=1; i<n; i++){
    //         if(n%i==0){
    //             sum+=i;
    //         }
    //     }
    //     if(sum==n){
    //         System.out.println("Perfect Number");
    //     }
    //     else{
    //         System.out.println("Not a Perfect Number");
    //     }
    // }

    //===========================================================
    //AUTOMPRPHIC NUMBER- A no. whose square ends with the same digit as the number itslf.

    // static void Automorphic(int n){
    //     int n1=n;
    //     String s1 = Integer.toString(n1);
    //     int sq= n*n;
    //     String s2 = Integer.toString(sq);

    //     int l1= s1.length();
    //     int l2 = s2.length();
    //     String s3 = s2.substring(l2-l1);

    //     if(s1.equals(s3)){
    //         System.out.println("Automorphic Number");
    //     }
    //     else{
    //         System.out.println("Not an Automorphic Number");
    //     }

    // }
    //=========================================================
    static void FriendlyPair(int n1, int n2){
        int sum1=0,sum2=0;
        for(int i=1; i<n1; i++){
            if(n1%i==0){
                sum1+=i;
            }
        }
        for(int i=1; i<n2; i++){
            if(n2%i==0){
                sum2+=i;
            }
        }

        if(sum1==n2 && sum2==n1){
            System.out.println("Friendly Pair");
        }
        else{
            System.out.println("Non Frienfly Pair");
        }
    }
         
    public static void main(String[] args) {
        // System.out.println("Enter a number: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // Armstrong(num);
        //===========================================================
        // System.out.println("Enter starting number: ");
        // Scanner sc = new Scanner(System.in);
        // int start = sc.nextInt();
        // System.out.println("Enter last number: ");
        // int end = sc.nextInt();
        // ArmstrongRange(start, end);
        //===========================================================
        // Fibonacci(n);
        //=================================================
        // System.out.println("Enter power: ");
        // int p=sc.nextInt();
        // power(n,p);
        //================================================
        // factor(n);
        //============================================
        // strongNumber(n);
        //====================================
        // PerfectNumber(n);
        //======================================
        // Automorphic(n);
        //=======================================
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        FriendlyPair(n1,n2);
        sc.close();
    }
}
