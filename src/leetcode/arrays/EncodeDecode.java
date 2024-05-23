package leetcode.arrays;

import java.util.*;

import static java.lang.Integer.getInteger;

public class EncodeDecode {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String s: strs){
            encode.append(s.length()).append("?").append(s);
        }
        return encode.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0, j;
        while(i < str.length()){
            j=i;
            while(str.charAt(j) != '?') j++;
            int length = Integer.valueOf(str.substring(i,j));
            result.add(str.substring(j+1, j+length+1));
            i= j+length+1;
        }
        return result;
    }

    public static void main(String[] args) {
        EncodeDecode ed = new EncodeDecode();
        System.out.println(ed.encode(Arrays.asList("Hello", "World", "Java")));
        System.out.println(ed.decode("5?Hello5?World4?Java"));
    }
}
