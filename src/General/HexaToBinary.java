package General;

public class HexaToBinary {
    public static void main(String[] args) {

        String hexa = "A2B";

        char[] chars = hexa.toCharArray();
        int length = chars.length;
        double sum = 0;
        int value;
        for (int i = 0; i < length; i++) {
            switch (chars[i]) {
                case 'A':
                    value = 10;
                    break;
                case 'B':
                    value = 11;
                    break;
                default:
                    value = Integer.parseInt(chars[i] + "");
                    break;
            }
            sum = sum + value * Math.pow(16, (chars.length - 1) - i);
        }
        System.out.println("Decimal value" + sum);

        int remainder;
        String binary = "";
        while (sum > 1) {
            remainder = (int)sum % 2;
            sum = sum / 2;
            binary = String.valueOf(remainder).concat(binary);
        }
        System.out.println(binary);
    }
}
