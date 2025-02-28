package ArraysProblem;

import java.util.Arrays;

public class LonestConsecutive {

    public static void main(String[] args) {


        int[] arr = { 1, 2, 0, 1};

        System.out.println(better(arr));
    }


    public static int better(int[] arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int longest = 1;
        int currCount = 0;
        int lastSmaller = Integer.MIN_VALUE;
        String str2 = "nayan";
        StringBuilder str = new StringBuilder("nayan");
        String temp = str.toString();
        System.out.println(str2 == str.reverse().toString());

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - 1 == lastSmaller ){
                currCount++;
                lastSmaller = arr[i];
            } else if (arr[i] == lastSmaller) {
                lastSmaller = arr[i];
            }else {
                currCount = 1;
                lastSmaller = arr[i];
            }

            longest = Integer.max(longest, currCount);

        }
        return longest;
    }
}
