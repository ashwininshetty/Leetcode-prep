package leetcode.arrays;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> temp = new HashMap<>();

        for (String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!temp.containsKey(sorted)){
                temp.put(sorted, new ArrayList<>());
            }
            temp.get(sorted).add(s);
        }
        return new ArrayList<>(temp.values());
    }

}
