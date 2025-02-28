package TCS;

public class OddlyEvenProblemStatement {

    public static long oddlyEvenProblemStatement(long num){


        long evenSum = 0;
        long oddSum = 0;

        while (num > 0){
            long rem = num % 10;
            if (rem % 2 == 0){
                evenSum += rem;
            }else{
                oddSum += rem;
            }

            num = num / 10;
        }


        return Math.abs(evenSum - oddSum);


    }
    public static void main(String[] args) {


        System.out.println(oddlyEvenProblemStatement(4567));
        System.out.println(oddlyEvenProblemStatement(5476));
        System.out.println(oddlyEvenProblemStatement(983498765));

    }
}
