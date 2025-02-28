package ArraysProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {

    public static void main(String[] args) {
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        int[] arr = {2, 2, 2, 2};
//        int target = 8;
//
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1; j < arr.length; j++) {
                if ( j > i+1 && arr[j] == arr[j-1]) continue;

                int left = j+1;
                int right = arr.length-1;

                while(left < right){
                    long sum = arr[i] + arr[j];
                    sum += arr[left];
                    sum += arr[right];

                    if (sum == target){
                        List<Integer> ans = Arrays.asList(arr[i], arr[j], arr[left], arr[right]);
                        result.add(ans);
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left-1]) left++;
                        while (left < right && arr[right] == arr[right+1]) right--;
                    } else if (sum > target) {
                        right--;
                    }else {
                        left++;
                    }

                }

            }

        }


        System.out.println(result);
    }
}
