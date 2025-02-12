package ArraysProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderElements {
    public static void main(String[] args) {

        int[] arr = { 11, 22, 6, 12, 7, 6};
        ArrayList<Integer> ans = new ArrayList<>();

//        BRUTE APPROACH

//        for (int i = 0; i < arr.length; i++) {
//            boolean leader = true;
//
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] > arr[i]){
//                    leader = false;
//                }
//
//            }
//
//            if (leader == true){
//                ans.add(arr[i]);
//            }
//
//        }

//      Optimal Solution
        int maximum = Integer.MIN_VALUE;

        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] > maximum){
                ans.add(arr[i]);
                maximum = arr[i];
            }

        }

//        System.out.println(ans);
//        Collections.reverse(ans);
//        System.out.println(ans);
//
//        System.out.println(ans);


        LeaderInArrayList();
    }


    public static void LeaderInArrayList(){
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> ans = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(12);
        list.add(7);
        list.add(6);
        int maximum = Integer.MIN_VALUE;
        for (int i = list.size()-1; i >= 0 ; i--) {
            if(list.get(i) > maximum){
                ans.add(list.get(i));
                maximum = list.get(i);
            }

        }
        System.out.println(list);
        System.out.println(ans);
    }
}
