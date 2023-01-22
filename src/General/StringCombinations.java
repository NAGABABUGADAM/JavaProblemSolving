package General;

public class StringCombinations {

    public static void main(String[] args) {

        //ab
        //ab ba
        //abc
        //abc acb bca bac cab cba

        String input = "abcd";

        for(int i=0;i<input.length();i++){
            String c= String.valueOf(input.charAt(i));
            StringBuilder otherChars = new StringBuilder(input.replaceFirst(c, ""));

            String string1 = c.concat(otherChars.toString());
            System.out.println(string1);
            if(otherChars.length()>1) {
                String string2 = c.concat(otherChars.reverse().toString());
                System.out.println(string2);

            }
        }
    }
}
