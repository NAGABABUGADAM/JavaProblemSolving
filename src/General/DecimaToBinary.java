package General;

public class DecimaToBinary {

    public static void main(String[] args) {

        int n = 3, r, max = 0, counter = 0;
        String binary = new String();


        while (n > 1) {
            r = n % 2;
            n = n / 2;
            binary = String.valueOf(r).concat(binary);

            if (n == 1) {
                binary = n + binary;

            }
            if (r == 1 || n == 1) {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 0;
            }
        }
        System.out.println("Binary "+binary);
        System.out.println("maxNumberOf Consecutive 1's "+max);
    }
}
