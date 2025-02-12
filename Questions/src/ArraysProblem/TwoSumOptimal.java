package ArraysProblem;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff)){
                System.out.println(map.get(diff) + ", " + i);
            }else {
                map.put(nums[i] , i);
            }

        }



    }

}
