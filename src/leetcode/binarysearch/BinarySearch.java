package leetcode.binarysearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int i=0, j= nums.length-1, mid;
        while(i<=j){
            mid = (i+j)/2;
            //imp: to avoid arithmetic overflow say both i and j are 2^31, in this case, when you add such huge values it might lead to arithmetic overflow therefore you can do it diff
            // mid = i+((j-i)/2)) //basically take distance between left and right / 2 and then add the left index (i) to it.
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target){
                j = mid-1;
                continue;
            }
            i= mid+1;
        }
        return -1;
    }

}
