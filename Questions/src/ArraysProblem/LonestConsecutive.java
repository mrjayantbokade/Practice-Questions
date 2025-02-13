package ArraysProblem;

import java.util.Arrays;

public class LonestConsecutive {

    public static void main(String[] args) {


        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1};

        System.out.println(better(arr));
    }


    public static int better(int[] arr){

        Arrays.sort(arr);
        int longest = 1;
        int currCount = 0;
        int lastSmaller = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - 1 == lastSmaller ){
                currCount++;
                lastSmaller = arr[i];
            } else if (arr[i]-1 != lastSmaller ) {
                lastSmaller = arr[i];
                currCount = 1;
            }

            longest = Integer.max(longest, currCount);

        }
        return longest;
    }
}
