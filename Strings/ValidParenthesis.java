package Strings;
import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean validParenthesis(String s){
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>(); 
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(int i=0 ; i<s.length();i++){
            char currentChar = s.charAt(i);
            if(map.containsKey(currentChar)){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != map.get(currentChar)){
                    return false;
                }
            }
            else{
                stack.push(currentChar);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean isValid = validParenthesis(s);
        System.out.println(isValid);
    }


}
