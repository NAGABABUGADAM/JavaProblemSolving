package General;

public class StringPermutationsLoop {

    public static void main(String[] args) {

        String input = "Lets";
        int len = input.length();
        for (int i = 0; i < input.length(); i++) {

            System.out.println(input.substring(0,i)+ input.substring(i,len));

        }

    }
}
