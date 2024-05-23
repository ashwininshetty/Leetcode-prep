package leetcode.twopointers;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        for(int i=0; i< nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
               continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == -(nums[i])) {
                    sol.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                    continue;
                }
                if (nums[k] + nums[j] < -(nums[i])) {
                    j++;
                    continue;
                }
                k--;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
