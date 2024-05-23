package leetcode.twopointers;

//substring takes everything from beginIndex till endIndex excluding the endIndex. But index starts at 0 so we should do -1. because nayan is odd /2 will give 2 which is y so you gotta get substring 0,2 so it takes 0 and 1.
public class Palindrome {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }















//    public boolean isPalindrome(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        for(int i=0;i<s.length();i++){
//           if(!(s.charAt(i)==s.charAt(s.length()-1-i))){
//               return false;
//           }
//        }
//        return true;
//    }
}
