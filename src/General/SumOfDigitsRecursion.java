package General;

public class SumOfDigitsRecursion {


    public static void main(String[] args) {

        System.out.println(sumOfNums(4));

    }

    private static int sumOfNums(int i) {

        if(i==0){
            return 0;
        }else{
            return i%10+sumOfNums(i/10);
        }
    }


}
