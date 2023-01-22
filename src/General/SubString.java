package General;

public class SubString {

    public static void main(String[] args) {

        Double d = Double.parseDouble("12");
        System.out.println(d);
        String s= String.valueOf(d);
        System.out.println(s);
        System.out.println(s.substring(0,s.length()-2));

    }
}
