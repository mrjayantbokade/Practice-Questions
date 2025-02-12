package ArraysProblem;

import java.util.Arrays;

public class MissingNumber {


    public static void main(String[] args) {
        int[] arr = { 9,6,4,2,3,5,7,0,1};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != i){

                System.out.println( i );
                break;
            }

        }
    }
}
