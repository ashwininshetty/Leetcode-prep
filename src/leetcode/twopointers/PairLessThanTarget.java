package leetcode.twopointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i=0, j= nums.size()-1, output =0;
       while(i<j){
           if(nums.get(i)+ nums.get(j) < target){
               output+=(j-i);
               i++;
               continue;
           }
           j--;
       }
       return output;
    }

    public static void main(String[] args) {
        PairLessThanTarget pd = new PairLessThanTarget();
        System.out.println(pd.countPairs(Arrays.asList(-6,2,5,-2,-7,-1,3), -2));
    }
}
