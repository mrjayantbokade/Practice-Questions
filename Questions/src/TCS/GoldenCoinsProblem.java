package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoldenCoinsProblem {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 6, 14, 18, 1, 18, 4, 3, 8};
//        List<List<Integer>> result = new ArrayList<>();

        int left = 0;
        int right = 0;
        int sum = 0;
        int k = 15;

       while (right < arr.length){

           sum += arr[right];
           while (sum > k){
               sum -= arr[left];
               left++;
           }

           if (sum == k){
               System.out.println(left + " " + right);

           }
           right++;
       }

//        System.out.println(result);
    }
}
