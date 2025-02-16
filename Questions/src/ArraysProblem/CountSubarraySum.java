package ArraysProblem;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;

        System.out.println(optimal(arr, k));
        System.out.println(brute(arr, k));
    }

    public static int brute(int[] arr, int k){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k){
                    count++;
                }
            }

        }

        return count;
    }


    public static int optimal(int[] arr, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // This accounts for subarrays that start from index 0.

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update current sum

            int diff = sum - k; // Check if `sum - k` exists in map

            if (map.containsKey(diff)) {
                count += map.get(diff); // Add occurrences of `sum - k` to count
            }

            // Store the prefix sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
