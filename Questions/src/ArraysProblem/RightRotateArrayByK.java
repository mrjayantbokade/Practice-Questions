package ArraysProblem;

import java.util.Arrays;

public class RightRotateArrayByK  extends LeftRotateOptimal{


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        k = k % n;

        System.out.println(Arrays.toString(arr));

        reverseArr(arr, 0, n-1);
        reverseArr(arr, 0, k);
        reverseArr(arr, k+1, n-1);


        System.out.println(Arrays.toString(arr));


    }
}
