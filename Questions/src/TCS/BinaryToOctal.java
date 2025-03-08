package TCS;

public class BinaryToOctal {

    public static int decimalToOctal(int num){
        String ans = "";

        while (num > 0){
            int rem = num % 8;
            ans  = rem + ans;
            num = num / 8;
        }

        System.out.println(ans + " ans this is");
        return Integer.parseInt(ans);
    }

    public static void main(String[] args) {



        int num = binaryToDecimal(10101);
        System.out.println(decimalToOctal(num));


    }

    private static int binaryToDecimal(int num) {
        String str = String.valueOf(num);
        int ansDeci = 0;
        int pow = 0;

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
//            System.out.println(ch);
            ansDeci += ((int)ch - (int)'0') * ( (int) Math.pow(2, pow++));
//            System.out.println(ansDeci);
        }

        return ansDeci;
    }
}
