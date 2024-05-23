package leetcode.slidingwindow;

public class MaxProfit {
    public int maxProfit(int[] prices) {
    int i=0, j=1, max=0;
    while(j<prices.length){
        if(prices[i]>prices[j]){
            i=j++;
            continue;
        }
        max= Math.max(max, prices[j]-prices[i]);
        j++;
    }
    return max;
    }
}
