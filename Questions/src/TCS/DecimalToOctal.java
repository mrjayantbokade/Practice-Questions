package TCS;

public class DecimalToOctal {


    public static int decimalToOctal(int num){

        String ans = "";
        while (num > 0){
            int rem = num % 8;
            ans = rem + ans;
            num = num / 8;
        }



        return Integer.parseInt(ans);
    }
    public static void main(String[] args) {

        System.out.println(decimalToOctal(256));
    }
}
