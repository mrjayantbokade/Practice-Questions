package ArraysProblem;

import java.lang.reflect.Array;
import java.util.*;

public class Sum3 {


    public static List<List<Integer>> optimal(int[] arr, int target){

        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int left = i+1;
            int right = arr.length-1;

            while (left < right){

                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target){
                    List<Integer> list = Arrays.asList(arr[i], arr[left], arr[right]);
                    result.add(list);
                    left++;
                    right = arr.length-1;
                }

                if (sum > target){
                    right--;
                }

                if (sum < target){
                    left++;
                }

            }

        }

        System.out.println("Optimal: " + result);
        return new ArrayList<>(result);
    }

    public static void brute(int[] arr, int z){


        HashSet<ArrayList<Integer>> hs = new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == z){
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        hs.add(ans);
                    }
                }

            }

        }

        System.out.println("Optimal: " + hs);

    }

    public static void main(String[] args) {

//        int[] arr = {-2, -2, -2, -1, -1, 0, 0, 2, 2, 2, 2};
        int[] arr = {-1, -1, 2, 0, 1};
//        brute(arr, 0);
        System.out.println(optimal(arr, 0));

    }
}
