package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[temperatures.length];
        for(int i=0; i< temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int index = stack.pop();
                output[index] = i - index;
            }
            stack.push(i);
        }
        return output;
    }

    public static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}
