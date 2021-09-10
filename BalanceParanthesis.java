package TopHundredCodes;

import java.util.Stack;

public class BalanceParanthesis {
    static boolean balanceParanthesis(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
                continue;
            }
        if(stack.isEmpty()){
            return false;
        }
        char check;
        switch(s.charAt(i)){
            case ')':
                     check = stack.pop();
                     if(check=='{' || check=='['){
                         return false;
                     }
                     break;
            case '}':
                    check = stack.pop();
                    if(check=='(' || check=='['){
                        return false;
                    }
                    break; 
            case ']':
                    check=stack.pop();
                    if(check=='(' || check=='{'){
                        return false;
                    }
                    break;                
        }
        }
        System.out.println(stack);
        
         
        

        
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String s="(){()}[";
        if(balanceParanthesis(s)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
    
}
