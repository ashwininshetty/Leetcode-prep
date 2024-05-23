package leetcode.arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int test, i;
        int j = 0;
        for (i = 0; i<nums.length; i++){
            test = target - nums[i];
            for(j = i+1; j< nums.length ;j++){
                if (nums[j] == test){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{i, j};
    }
}


//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> prevMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            int diff = target - num;
//
//            if (prevMap.containsKey(diff)) {
//                return new int[] { prevMap.get(diff), i };
//            }
//
//            prevMap.put(num, i);
//        }
//
//        return new int[] {};
//    }
//you can do this using hashmap as well,
//create an empty hashmap > find diff = target-i > if present then return diff and i index if not add i's value and i to hashmap.> iteration 1 only one element added, iteration 2 if 1'st added value is the diff then return if not add 2nd value
