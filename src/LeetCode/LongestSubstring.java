package LeetCode;

public class LongestSubstring {

    public static void main(String[] args) {

        int substringLenght = lengthOfLongestSubstring("HEMHHJA");
        System.out.println(substringLenght);
    }


    public static int lengthOfLongestSubstring(String s) {

        char c[] = s.toCharArray();
        int length = c.length;
        int substrlength = 0;

        int max = 0;

        if(length==1){
            return 1;
        }

        for (int i = 0; i < length; i++) {
            String str=String.valueOf(c[i]);
            for (int j = i + 1; j < length; j++) {
                if (!str.contains(String.valueOf(c[j]))) {
                    str = str.concat(String.valueOf(c[j]));
                    if(j==length-1){
                        substrlength = str.length();
                    }
                } else {
                    substrlength = str.length();
                    break;
                }
            }

            max= Math.max(substrlength,max);
        }
        return max;
    }





}
