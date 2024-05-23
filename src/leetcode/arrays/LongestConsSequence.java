package leetcode.arrays;

import java.util.*;

public class LongestConsSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();
        int longest=0, length = 0;
        for(int n : nums) sequence.add(n);
        for(int n : sequence){
            if(!sequence.contains(n-1)){
                length = 1;
                while(sequence.contains(n+length)){
                    length++;
                }
                longest = (length>longest)?length:longest;
            }
        }
        return longest;
    }
}
