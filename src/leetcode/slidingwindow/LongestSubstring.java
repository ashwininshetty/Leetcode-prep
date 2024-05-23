package leetcode.slidingwindow;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len=0, i=0, j=0;
        Set<Character> set = new HashSet<>();
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
               set.add(s.charAt(j));
               len = Math.max(len, set.size());
               j++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("ynyo"));
    }
}

//This implementation is with queue which worked just fine
/*
*  public int lengthOfLongestSubstring(String s) {
      int len=0, j=0;
        Queue<Character> queue = new LinkedList<>();
        while(j<s.length()){
            if(queue.contains(s.charAt(j))){
                queue.remove();
            }else{
               queue.add(s.charAt(j));
               len = Math.max(len, queue.size());
               j++;
            }
        }
        return len;
    }*/
