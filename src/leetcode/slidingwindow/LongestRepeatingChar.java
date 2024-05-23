package leetcode.slidingwindow;

public class LongestRepeatingChar {
    public int characterReplacement(String s, int k) {
        int i = 0, maxf = 0, ans =0;
        int[] alp = new int[26];
        for(int j=0; j< s.length(); j++){
            alp[s.charAt(j) - 'A']++;
            maxf = Math.max(maxf, alp[s.charAt(j) - 'A']);
            if(j-i+1-maxf>k){
                alp[s.charAt(i) - 'A']--;
                i++;
                continue;
            }
            ans = Math.max(ans, j-i+1);

        }
        return ans;

    }

}
