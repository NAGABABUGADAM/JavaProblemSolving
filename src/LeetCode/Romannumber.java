package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Romannumber {

    public static void main(String[] args) {






        System.out.println(romanToInt("XIV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IXIV"));



    }

    public static int romanToInt(String s) {


        int val = 0;

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("IV", 4);
        stringIntegerMap.put("IX", 9);
        stringIntegerMap.put("XL", 40);
        stringIntegerMap.put("XC", 90);
        stringIntegerMap.put("CD", 400);
        stringIntegerMap.put("CM", 900);

        for (Map.Entry entry : stringIntegerMap.entrySet()) {
            if (s.contains(String.valueOf(entry.getKey()))) {
                val = val + (int) entry.getValue();
                s = s.replace(String.valueOf(entry.getKey()), "");
            }
        }
        for (char c : s.toCharArray()) {
            val = val + getval(c);
        }
        return val;

    }


    private static int getval(char c) {

        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}

// Effective solution
/*    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
"XIV"
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n=s.length();

        int res=map.get(s.charAt(n-1));

        for(int i=s.length()-2;i>=0;i--)
        {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                res-=map.get(s.charAt(i));
            else
                res+=map.get(s.charAt(i));
        }
        return res;
    }*/
