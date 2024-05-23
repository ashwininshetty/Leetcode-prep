package leetcode.arrays;

import java.util.HashMap;

class Duplicates {

    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> array = new HashMap<Integer, Integer>();
        for (int num: nums){
            if(array.containsKey(num)){
                return true;
            }
            array.put(num, 1);
        }
        return false;
    }
}
