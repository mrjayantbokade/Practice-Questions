package ArraysProblem;

import java.util.Arrays;

public class LeftRotateOptimal {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 9;

        k = k % arr.length;

        System.out.println(Arrays.toString(arr));

        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, arr.length-1);
        reverseArr(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArr(int[] arr, int left, int right) {


        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
