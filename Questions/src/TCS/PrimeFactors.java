package TCS;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {



    public static List<Integer> allPrimeFactors(int num){
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0){
                list.add(i);
                num /= i;
            }

        }

        return  list;
    }

    public static List<Integer> primeFactors(int num){

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= num ; i++) {
            if (num % i == 0){
                if (isPrime(i)){
                    list.add(i);
                }
            }

        }
        return list;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num ; i++) {
            if (num % i == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(primeFactors(101));
        System.out.println(allPrimeFactors(100));
    }
}
