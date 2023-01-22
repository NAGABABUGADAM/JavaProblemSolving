package LeetCode;

import java.util.HashSet;

public class LongestSubstringUsingSet {

    public static void main(String[] args) {

        int substringLenght = lengthOfLongestSubstring("HEMHHJA");
        System.out.println(substringLenght);
    }


    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                result = Math.max(result, set.size());
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return result;
    }
   /* public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int result = 1;
        int i=0;
        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                result = Math.max(result, set.size());
            }else{
                while(i<j){
                    if(s.charAt(i)==c){
                        i++;
                        break;
                    }

                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }

        return result;
    }*/




}
