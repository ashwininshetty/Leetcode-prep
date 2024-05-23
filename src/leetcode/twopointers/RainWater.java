package leetcode.twopointers;

public class RainWater {
    public int trap(int[] height) {
        int i=0, j= height.length-1, res=0;
        int lMax= height[i], rMax = height[j];
        while(i<j){
          if(height[i]<height[j]){
              i++;
              res = Math.min(lMax, rMax)-height[i]>0 ?(res+ (Math.min(lMax, rMax)-height[i])) : res;
              lMax = Math.max(lMax, height[i]);
          }else{
              j--;
              res = Math.min(lMax, rMax)-height[j]>0 ?(res+ (Math.min(lMax, rMax)-height[j])) : res;
              rMax = Math.max(rMax, height[j]);
          }

        }
        return res;
    }

    public static void main(String[] args) {
        RainWater tp = new RainWater();
        System.out.println(tp.trap(new int[]{5,4,1,2}));
    }
}
