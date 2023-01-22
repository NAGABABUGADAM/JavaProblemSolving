package General;

public class StringReverseRecursion {

    public static void main(String[] args) {


        //System.out.println("NAG".substring(0,3));

        System.out.println(reverse("HEMAJA"));

    }

    private static String reverse(String str) {


        if(str.length()==0){
            return "";
        }

        return str.charAt(str.length()-1)+(reverse(str.substring(0,str.length()-1)));
    }



}
