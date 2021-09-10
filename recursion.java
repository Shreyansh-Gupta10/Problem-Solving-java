// import jdk.internal.module.SystemModuleFinders;

package Recursion; 
import java.util.Collections;
 import java.util.ArrayList; 
// import org.graalym.compiler.graph.spi.Canonicalizable.Binary; 
public class recursion{
 
// public class recursion {// 1+2+3+4+5......(n).
    // static int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
        

    //     return (n + sum(n-1));
    // }
    //=========================================1*2 + 2*3 + 3*4 + .....+ n(n+1)

    // static int add(int n){
    //     if(n==1){
    //         return 2;
    //     }
    //     return n*(n+1) + add(n-1);
    // }

    //======================================== 1,2,3,4,5,....,n
    //  static void series(int n){
    //      if(n==1){
    //          System.out.println(n);
    //          return;
    //      }
    //      series(n-1);
    //      System.out.println(n);
          
    //  }
    //=========================================count vowels in string. 
    // static int VowelsCount(String s, int i){
    //     if(s.length() == i){
    //         return 0;
    //     }
    //     if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
    //         return 1+VowelsCount(s, i+1);
    //     }
    //     else{
    //         return VowelsCount(s, i+1);
    //     }
    // }
    //============================================Fibonacci Series 0,1,1,2,3,5,8,13,----n
    //0,1,1,2,4,7,13,--
    // static int  fibo(int n){
    //     if(n==0){
    //         return n;
    //     }
    //     if(n==1 || n==2){
    //         return 1;
    //     }
    //     return fibo(n-1)+fibo(n-2)+fibo(n-3);

    // }
    //==================================================abc=> aa,ab,ac,ba,bb,bc,ca,cb,cc=> length of 2=>string.
    // static void permutation(String s, String newstr){
    //     if(newstr.length() == 2){
    //         System.out.println(newstr);
    //         return;
    //     }
    //      for(int i=0; i<s.length(); i++){
    //         permutation(s,newstr+s.charAt(i));
    //      }
    // }
    //======================================length of 3 => string with no repetetion.
    // static void perm(String s, String newstring){
    //     if(newstring.length() == 3){
    //         System.out.println(newstring);
    //         return;
    //     }
    //     for(int i=0; i<s.length(); i++){
    //         String soption = s.substring(0,i) + s.substring(i+1);
    //         perm(soption, newstring+s.charAt(i));
    //     }
    // }
    //================================================
//     static void perm(String s, String newstring){
//             if(newstring.length() == 3){
//                 System.out.println(newstring);
//                 return;
//             }
//             for(int i=0; i<s.length(); i++){
//                 String soption =   s.substring(i+1);
//                 perm(soption, newstring+s.charAt(i));
//             }
//         }
//===================================product of array except itself.I/o=>[1,2,3,4], O/P=> [24,12,8,6]
// static void prodExceptSelf(int arr[]){
//     int prod = 1;
//     int pr[] = new int[arr.length];
    
//      for(int i=0; i<arr.length; i++){
//         prod = 1;
//          for(int j=0; j<arr.length; j++){
            
//             if(i != j){
//                 prod *= arr[j];
//             }
//          }
//          pr[i] = prod;
//     }
//     System.out.println(pr);
// }
//================================================================== print odd nums
// static void printOdd(int n){
//     if(n==0){
//         return;
//     }
//     printOdd(n-1);
//     if(n%2 == 1){
//         System.out.print(n+" ");
//     }
// }
//===============================print 543212345 if n=5
// static void series(int n){
//     if(n==1){
//         System.out.print(n+" ");
//         return;
//     }
//     System.out.print(n+" ");
//     series(n-1);
//     System.out.print(n+" ");

// }
//================================return sum of array using recursion arr=[1,2,3,4,5,6]
// static int sumofarr(int arr[], int i, int sum){
//     if(i==arr.length){
//         return sum;
//     }
//     sum += arr[i];
//      return sumofarr(arr, i+1, sum);
  
     
// }
//==============================sum of array without using sum variable using recursion.
// static int sumofarr(int arr[], int i){
//     if(i==arr.length){
//         return 0;
//     }
//     return arr[i] + sumofarr(arr, i+1);
// }
//====================================================make a tree of num 1 to 15
// static int values = 0;
// static void tree(int n,int levels){
     
//     if(levels == n){
//         return;
//     }
//     else{
         
//         values++;
//         int nodenum = values;
//         tree(n, levels+1);
//         System.out.print(nodenum+ " ");
//         tree(n, levels+1);
         
         
         
//     }
// }
//=========================================Staircase to reach total staircase while jumping where max jump=3
// static int count = 0;
// static void stairs(int total_steps, int current_step, int max_jump){
//     if(current_step > total_steps){
//         return;
//     }
//     else if(current_step == total_steps){
//         count++;
//         return;
//     }
//     else{
//         for(int i=1; i<=max_jump; i++){
//             stairs(total_steps, current_step+i, max_jump);
//         }
//     }
// }
//=====================================Binary search
// static int BinarySearch(int arr[],int key,int low,int high){
//     if(low>high){
//         return -1;
//     }
//     int middle = low+(high-low)/2;
//     if(arr[middle] == key){
//         return middle;
//     }
//     else if(arr[middle] < key){
//         return BinarySearch(arr, key, middle+1, high);
//     }
//     else if(arr[middle] > key){
//         return BinarySearch(arr, key, low, middle-1);
//     }
//     return -1;



// }
// static int rollTheDice(int face, int targetSum, int currentSum, String path){
//     if(currentSum == targetSum){
//         System.out.println(path);
//         return 1;
//     }
//     else if(currentSum > targetSum){
//         return 0;
//     }
//     int count = 0;
//     for(int i=1; i<=face; i++){
//         count += rollTheDice(face, targetSum, currentSum+i,path+i);
//     }
//     return count;
// }

//===============================================with no two 1's together in binary of length 4 
 
// static void Binary(String bin){ 
     
//     if(bin.length()== 4 ){
//         System.out.println(bin);
         
//         return;
//         }
//     if(bin.length()>0 && bin.charAt(bin.length()-1) == '1'){
//         Binary(bin+0);
//     }
//     else{
//         Binary(bin+0);
//         Binary(bin+1);
//     }
//=============================================
    
    // for(int i=0; i<2; i++){
    //     Binary(bin+i);
    // }
    
     

//================================================with no repetition 
// static int word(String s, String letters){
//     if(letters.length() == 3){
//         System.out.println(letters);
//         return 1;
//     }
//     int count =0;
//     for(int i=0; i<s.length(); i++){
//         String soption = s.substring(0,i) + s.substring(i+1);
//         count += word(soption, letters+s.charAt(i));
//     }
//     return count;
// }
// static void PowerSet(String s, int k,  String l){
//     if(k == arr.length){
//         return ;
//     }
//     System.out.println(l);
//     for(int i=k+1; i<s.length(); i++){
//         // ref.add(arr[i]);
//         PowerSet(s, i, l+s.charAt(i));
//     }
// }
//========================================================================
// static void palindromePartition(String s, String pal, int index){
     
//     if(pal.length() < s.length()){
//         System.out.println(pal);
//     }
//     if(index == s.length()){
        
//         return;
//     }

//     for(int i = index+1; i<=s.substring(i,i+1).length(); i++){
//         palindromePartition(s, pal+s.charAt(i), i);
//     }
// }
//==============================================================================================
//    static void coinChange(int arr[], int amount,int index, int sum, ArrayList<Integer> coinList, ArrayList<Integer> list){
     
//     if(sum == amount){
//         System.out.println(coinList);

//         list.add(coinList.size());
         
//         return ;
//     }
    


//     for(int i=index; i<arr.length; i++){
         
//          if(sum <= amount){ 
//             coinList.add(arr[i]);
//             coinChange(arr, amount, i,sum+arr[i], coinList, list);
//             coinList.remove(coinList.size()-1);
//          }
//     }
     
//====================================================================
static int StringLength(String str){
     
    // if(str.length() == 0){
         
    //     return -1;
    // }
    // if(str.length() == 1){
    //     return str.length();
    // }



    int i=0; 
    int j = i+1;
    while(i<j){
        if(str.charAt(i) == '0' && str.charAt(j) == '1' || str.charAt(i) == '1' && str.charAt(j) == '0'){
            String stroption = str.substring(0,i) + str.substring(j+1);
            StringLength(stroption);
        }
        else{
            i++;
            j++;
        }
    }
    return str.length();
}


 

public static void main(String[] args) {
    String str = "01110";  
    System.out.println(StringLength(str));
    // System.out.println(str);
    
    // for( ;i<j; ){

    //     if(str.charAt(i) == '0' && str.charAt(j) == '1' || str.charAt(i) == '1' && str.charAt(j) == '0'){
    //         String stroption = str.substring(0,i) + str.substring(j+1);
    //         str = stroption;
                    
    //         }
    //     else{
    //         i++;
    //         j++;
    //     }


    // StringLength(str);
        //========================================
        // String s = "ababa";
        // String pal = "";
        //=========================================
        // int arr[] = {411,412,413,414,415,416,417,418,419,420,421,422};
         
        // int amount = 9864;
         
        // // String coins = "";
        // // ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // ArrayList<Integer> coinList = new ArrayList<Integer>();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // coinChange(arr, amount,0, 0 , coinList, list);
         
        // System.out.println(list);
        // System.out.println(Collections.min(list));
        //==========================================================
    
        // palindromePartition(s, "", -1);
        //===============================
        // String s = "123";
         
        // PowerSet(s, -1, "");
        //=======================================
        


        // String s = "abcdefgh";
        // System.out.println(word(s, ""));
        //===========================================
        // String bin = "";
        // Binary(bin);
        //==================================
        // int face = 6;
        // int targetSum = 5;
        // int ways = rollTheDice(face, targetSum, 0," ");
        // System.out.println(ways);
        //===============================

        // int arr[] = {1,2,3,4,5,6};
        // System.out.println(sumofarr(arr,0));
        // tree(3,0);
        //----------------------------------
        // stairs(6,0,3);
        // System.out.println(count);
        //========================
        // int arr[] = {2,3,4,5,6,7,8,9};
        // System.out.println(BinarySearch(arr,7,0,arr.length-1));
        //---------------------------------
        //==================================================== //{{1,4,7},
                                                               //{2,5,8},
                                                               //{3,6,9}}
         
    
} 
}


    
        
         
    
    
     
