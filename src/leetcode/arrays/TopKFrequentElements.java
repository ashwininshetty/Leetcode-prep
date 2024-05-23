package leetcode.arrays;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> num = new HashMap<>();
        int[] kFreqNumbers = new int[k];
        for(int i :nums){
            if(!num.containsKey(i)){
                num.put(i, 0);
            }
            num.put(i, num.get(i)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        pq.addAll(num.entrySet());
        for(int i=0; i<k; i++){
            kFreqNumbers[i] = pq.poll().getKey();
        }
        return kFreqNumbers;
    }

    public static void main(String[] args) {
        TopKFrequentElements tk = new TopKFrequentElements();
        tk.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }
}
