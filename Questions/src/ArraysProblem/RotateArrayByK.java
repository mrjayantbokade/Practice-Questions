package ArraysProblem;

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;

        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[k];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int j = k; j < arr.length; j++) {
            arr[j-k] = arr[j];
        }

        int m = 0;
        for (int z = arr.length-k; z < arr.length; z++) {
            arr[z] = newArr[m];
            m++;

        }

        System.out.println(Arrays.toString(arr));
    }
}
