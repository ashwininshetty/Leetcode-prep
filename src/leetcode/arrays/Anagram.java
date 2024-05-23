package leetcode.arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        if(!(s.length() == t.length())){
            return false;
        }
        int[] store =  new int[26];
        for(int i=0; i<s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for(int n: store){
            if (n!=0){
            return false;
            }
        }
        return true;
//        HashMap<Character, Integer> setS = new HashMap<>();
//        HashMap<Character, Integer> setT = new HashMap<>();
//        if(!(s.length() == t.length())){
//            return false;
//        }
//        for(char c : s.toCharArray()){
//            if(setS.containsKey(c)){
//                setS.put(c, setS.get(c)+1);
//                continue;
//            }
//            setS.put(c, 1);
//        }
//        for(char c : t.toCharArray()){
//            if(setT.containsKey(c)){
//                setT.put(c, setT.get(c)+1);
//                continue;
//            }
//            setT.put(c, 1);
//        }
////        System.out.println(setT);
//        if(setT.equals(setS)){return true;}
//        return false;
    }
}

//    sucheta mam's logic. It's an alphabet so use 26 index array and increase the count of each alphabet by 1 at its' respective index.
//public boolean isAnagram(String s, String t) {
//    if(!(s.length() == t.length())){
//            return false;
//            }
//    int[] store =  new int[26];
//    for(int i=0; i<s.length(); i++){
//
//            }
