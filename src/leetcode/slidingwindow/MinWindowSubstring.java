package leetcode.slidingwindow;

import java.util.HashMap;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        char stringChar;
        String minSubString = ""; //in this example it's intialised with "" so that I can return this, in other scenarios if you don't do this then default value of null will be taken, concatenation will become difficult
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
            sMap.put(c, 0);
        }
        int i=0, have =0, need = tMap.size(), minSubStringLength= s.length()+1; //made this s.length+1 otherwise first if condition in while loop wouldn't pass
        for(int j=0; j<s.length();j++){
              stringChar = s.charAt(j);
              if(sMap.containsKey(stringChar)){
                  sMap.put(stringChar, sMap.get(stringChar)+1);
                  if(sMap.get(stringChar).equals(tMap.get(stringChar))){
                      have++;
                  }
                  while(have == need){
                      if(j-i+1<minSubStringLength){
                          minSubString = s.substring(i,j+1);
                          minSubStringLength = j-i+1;
                      }
                      if(sMap.containsKey(s.charAt(i)) && sMap.put(s.charAt(i), sMap.get(s.charAt(i))-1) < tMap.get(s.charAt(i)) ){
                              have--;
                      }
                      i++;
                  }

              }
        }
        return minSubString;
    }

    public static void main(String[] args) {
        MinWindowSubstring min = new MinWindowSubstring();
        System.out.println(min.minWindow("aa", "aa"));
    }
}
