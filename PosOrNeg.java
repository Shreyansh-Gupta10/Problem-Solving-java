package TopHundredCodes;

import java.util.Scanner;

public class PosOrNeg {
    //Sum of Digits of a Number
    // static void sumOfDig(int num){
    //     int rem;
    //     int sum=0;
    //     int n = num;
    //     while(n != 0){
    //         rem = n%10;
    //         sum += rem;
    //         n = n/10;
    //     }
    //     System.out.println("sum of digits of "+num+" is "+ sum);
    // }

    // Reverse of a number
    // static void reverseNum(int num){
    //     String s="";
    //     int rem;
    //     int n = num;
    //     while(n!=0){
    //         rem = n%10;
    //         s= s+ Integer.toString(rem);
    //         n = n/10;
    //     }
    //     System.out.println(s);
    // }

    //Palindrome number
    // static void palindrome(int num){
    //     int rev=0, rem;
    //     int n=num;
    //     while(n!=0){
    //         rem = n%10;
    //         rev=rev*10+rem;
    //         n=n/10;
    //     }
    //     if(rev==num){
    //         System.out.println("Palindrome number");
    //     }
    //     else{
    //         System.out.println("Not a palindrome number");
    //     }

    // }
    static void palindromeString(String s){
        String s2 ="";
        for(int i=s.length()-1; i>=0; i--){
            s2 = s2+s.charAt(i);
        }
        if(s2.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        String s= sc.nextLine();
        // sumOfDig(num);
        // reverseNum(num);
        // palindrome(num);
        palindromeString(s);


        //to check prime Number 
        // System.out.println("Enter a number: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int count = 0;
        // for(int i=1; i<=num; i++){
        //     if(num%i == 0){
        //         count+=1;
        //     }
        // }
        // if(count == 2){
        //     System.out.println(num+" is prime number");
        // }
        // else if(count > 2){
        //     System.out.println(num+" is not a Prime numbr");
        // }

        //=======================================================
        //to check leap year.
        // System.out.println("Enter a year: ");
        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();

        // if((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
        //     System.out.println(year+" is a Leap Year");
        // }
        // else{
        //     System.out.println(year+ " is not a leap year");
        // }
        //==============================================================

        // if(num>0){
        //     System.out.println("Positive number");
        // }
        // else if(num<0){
        //     System.out.println("Negative number");
        // }
        // else{
        //     System.out.println("Number is Zero");
        // }
        sc.close();

    }
}
