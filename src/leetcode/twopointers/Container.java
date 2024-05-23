package leetcode.twopointers;

public class Container {
    public int maxArea(int[] height) {
        int i=0, j= height.length-1, res=0, area;
        while(i<j){

             area = (j-i)*Math.min(height[i], height[j]);
             res = Math.max(area, res);
            if(height[i]>height[j]){
                j--;
                continue;
             }
             i++;
        }
        return res;
    }
}
