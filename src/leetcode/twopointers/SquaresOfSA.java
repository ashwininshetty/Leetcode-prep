package leetcode.twopointers;

import java.util.Arrays;

public class SquaresOfSA {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j= nums.length-1, k= nums.length-1;
        int[] solution= new int[nums.length];
        while(i<=j){
            if(Math.pow(nums[i], 2) < Math.pow(nums[j], 2)){
                solution[k--] = (int)Math.pow(nums[j], 2);
                j--;
            }else{
                solution[k--] = (int)Math.pow(nums[i], 2);
                i++;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        SquaresOfSA sq= new SquaresOfSA();
        int[] prin = sq.sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(prin));
    }
}
