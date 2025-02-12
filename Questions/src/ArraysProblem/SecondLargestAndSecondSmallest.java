package ArraysProblem;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {


    public static void main(String[] args) {


        int[] a = {1, 26, 3, 5, 9, 11};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;


        int left = 1;
        int right = a.length - 2;

        boolean flagss = false;
        boolean flagsl = false;

        while (!flagsl  || !flagss) {

            if (!flagsl && a[right] < a[a.length - 1]) {
                secondLargest = a[right];
                flagsl = true;
            } else {
                right--;
            }

            if (!flagss && a[left] > a[0]) {
                secondSmallest = a[left];
                flagss = true;
            } else {
                left++;
            }
        }


        System.out.println(secondLargest + " " + secondLargest);

    }
}
