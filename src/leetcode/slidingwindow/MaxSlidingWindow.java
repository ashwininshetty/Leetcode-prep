package leetcode.slidingwindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxWin = new int[nums.length - k +1];
        Deque<Integer> maxNum = new LinkedList<>();
        int i=0;
        for(int j=0; j<nums.length; j++){
            while(!maxNum.isEmpty() && nums[maxNum.peekLast()]<nums[j]){
                maxNum.removeLast();
            }
            maxNum.offer(j);
            if(j-i+1==k){
                maxWin[i++] = nums[maxNum.peekFirst()];
            }
            if(!maxNum.isEmpty() && maxNum.peekFirst() <= j-k+1)maxNum.pollFirst();

        }

        return maxWin;
    }

    public static void main(String[] args) {
        MaxSlidingWindow test = new MaxSlidingWindow();
        System.out.println(Arrays.toString(test.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
