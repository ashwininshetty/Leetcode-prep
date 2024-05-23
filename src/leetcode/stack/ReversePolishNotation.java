package leetcode.stack;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int rightOperand;
        for(String s : tokens){
            switch(s){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    rightOperand = stack.pop();
                    stack.push(stack.pop() - rightOperand);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    rightOperand = stack.pop();
                    stack.push(stack.pop()/rightOperand);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;
            }


        }
        return stack.pop();
    }

    public static void main(String[] args) {
        ReversePolishNotation test = new ReversePolishNotation();
        System.out.println(test.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
