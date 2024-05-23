package leetcode.twopointers;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
           int num = target- numbers[i];
           if(numbers[j] == num){
               return new int[]{i + 1, j + 1};
           }
           if(numbers[j] < num){
               i++;
              // j= numbers.length-1; line not required, j need not start from last again, because it's in ascending order say target is 13 1,2,3,4,6,7,11,16, since 1+16 is big you decrement j and second iter i is small you increment i and j stays where it is.
               continue;
           }
           if(numbers[j]>num){
               j--;
           }

        }
        return new int[]{};

    }

    // you also don't need to consider if equal, because there is one solution
/*By Neetcode dude*/
//    class Solution {
//
//        public int[] twoSum(int[] numbers, int target) {
//            int a_pointer = 0;
//            int b_pointer = numbers.length - 1;
//            int num_a, num_b;
//
//            while (a_pointer < b_pointer) {
//                num_a = numbers[a_pointer];
//                num_b = numbers[b_pointer];
//
//                if (num_a + num_b == target) break;
//
//                if (num_a + num_b < target) {
//                    a_pointer++;
//                    continue;
//                }
//
//                b_pointer--;
//            }
//
//            return new int[] { a_pointer + 1, b_pointer + 1 };
//        }
//    }

/* using hashmap, like in daa, empty set check if complement exists, if so return indices if not, add the current number
* Hashmap <Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the current index and the index of the complement
                return new int[] { map.get(complement), i };
            }

            // If the complement doesn't exist, put the current element and its index in the map
            map.put(nums[i], i);
        }*/

}
