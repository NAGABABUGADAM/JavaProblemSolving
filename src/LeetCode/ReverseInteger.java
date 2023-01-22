package LeetCode;

public class ReverseInteger {

    public static void main(String[] args) {

        int x = 1463847412;
        System.out.println(reverse(x));

    }

    public static int reverse(int x) {

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = x * -1;
        }

        int reverse = 0;
        int remainder;
        while (x > 0) {
            remainder = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            reverse = reverse * 10 + remainder;
            x = x / 10;

        }

        if (isNegative) {
            reverse = reverse * -1;
        }
        return reverse;

    }
}


