package General;

public class Fibanocci {


    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13
        int n1 = 0,n2 = 1,temp;
       for(int i =0;i<10;i++){

           System.out.println(n1);
           temp = n1+n2;
           n1 = n2;
           n2 = temp;
        }

    }
}
