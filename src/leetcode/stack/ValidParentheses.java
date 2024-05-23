package leetcode.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValidWithHash(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketsDict = new HashMap<>();
        bracketsDict.put(')', '(');
        bracketsDict.put(']', '[');
        bracketsDict.put('}', '{');
        for(int i=0; i<s.length(); i++){
           char elem = s.charAt(i);
           if(!bracketsDict.containsKey(elem)){
               stack.push(elem);
           }else if (stack.isEmpty()){
               return false;
           } else if (stack.pop()!= bracketsDict.get(elem)) {
              return false;
           }
        }
        return stack.isEmpty();
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char elem;
        for(int i=0; i<s.length(); i++){
            elem = s.charAt(i);
            if(elem == '(' || elem == '{' || elem == '['){
                stack.push(elem);
            } else if (stack.isEmpty() || elem == ')' && stack.pop() != '(' || elem == ']' && stack.pop() != '[' || elem == '}' && stack.pop() != '{') {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses valid = new ValidParentheses();
        System.out.println(valid.isValid(""));
    }
}
