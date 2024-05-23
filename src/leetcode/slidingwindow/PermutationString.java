package leetcode.slidingwindow;

import java.util.Arrays;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){return false;}
        int i=0;
        int[] str1 = new int[26];
        for(int k =0; k<s1.length(); k++){
            str1[s1.charAt(k)-'a']++;
        }
        int[] str2 = new int[26];;
        for(int j=0; j<s2.length(); j++){
            str2[s2.charAt(j)-'a']++;
            if(j >= s1.length()){
                str2[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(str2, str1)){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        PermutationString ps = new PermutationString();
        System.out.println(ps.checkInclusion("ab", "eidboaoo"));
    }
}
