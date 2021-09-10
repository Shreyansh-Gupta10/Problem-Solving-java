package TopHundredCodes;

import java.util.Scanner;

public class removeVowel {
    static void VowelRemove(String str, String res){
        int n=str.length();
        int i=0;
        while(i!=n){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'|| str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'){
                i++;
                continue;
            }
            else{
                res+=str.charAt(i);
                i++;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sring: ");
        String str = sc.next();
        String res="";
        VowelRemove(str, res);
        sc.close();
    }
}
