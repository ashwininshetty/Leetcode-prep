package leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        backtrack(0,0,n);
        return result;
    }
    public void backtrack(int openNum, int closeNum, int n){
        if(openNum==n && closeNum==n){
            result.add(sb.toString());
        }
        if(openNum<n){
            sb.append("(");
            backtrack(openNum+1, closeNum,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(closeNum<openNum){
            sb.append(")");
            backtrack(openNum, closeNum+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println(gp.generateParenthesis(2));
    }
}

//TODO: using stack but this uses iterator, in the above implementation I have used String Builder, which is more effecient
//List<String> result = new ArrayList<>();
//Stack<String> stack = new Stack<>();
//public List<String> generateParenthesis(int n) {
//    backtrack(0,0,n);
//    return result;
//}
//public void backtrack(int openNum, int closeNum, int n){
//    if(openNum==n && closeNum==n){
//        Iterator ite = stack.iterator();
//        String temp= "";
//        while(ite.hasNext()){
//            temp = temp + ite.next();
//        }
//        result.add(temp);
//    }
//    if(openNum<n){
//        stack.push("(");
//        backtrack(openNum+1, closeNum,n);
//        stack.pop();
//    }
//    if(closeNum<openNum){
//        stack.push(")");
//        backtrack(openNum, closeNum+1,n);
//        stack.pop();
//    }
//}
