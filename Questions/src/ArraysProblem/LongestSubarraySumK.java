package ArraysProblem;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK {


    public static void main(String[] args) {


        int[] arr = { 1, 2, 3, 1, 1, 1, 4, 2, 3};
//        int[] arr = { 3};
        int k = 3;

//        brute(arr, k);
//        better(arr, k);
        optimal(arr, k);




    }

    public static void optimal (int[] arr, int k){
        int sum = 0;
        int longest = 0;
        int i = 0;
        int j = 0;

        while (i < arr.length && j < arr.length){

            sum += arr[j];

            if (sum == k){
                longest = Integer.max(longest, j - i + 1);
                j++;
            }

            if (sum > k){
                sum = sum - arr[i];
                i++;
            }

            if (sum < k){
                j++;
            }

            if (sum > k && i == j){
                j++;
            }
        }
        System.out.println(longest);
    }

    public static void better(int[] arr, int k){


        Map<Integer, Integer> map  = new HashMap<>();

        int longest = 0;
        int sum = 0;

//        map.put(0,-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k){
                longest = Integer.max(longest, i+1);
            }
            int diff = sum - k;

            if (map.containsKey(diff)){
                int len =  map.get(diff);
                longest = Integer.max(longest, i - len);

            }

            if (!map.containsKey(sum)){

                map.put(sum, i);

            }

        }


        System.out.println(map);

        System.out.println(longest);

    }




    public static void brute(int[] arr, int k){
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0; int count = 0;
            for (int j = i; j < arr.length; j++) {
                count++;
                currentSum += arr[j];
                if (currentSum == k){
                    longest = Integer.max(longest, count);
                }



            }

        }

        System.out.println(longest);
    }
}
