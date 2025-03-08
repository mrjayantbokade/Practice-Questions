package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JohnWatsonKnowRightRotationOperation {

//        public void rotate(int[] arr, int k) {
//
//            k = k % arr.length;
//
//            reverseArr(arr, 0, k-1);
//            reverseArr(arr, k, arr.length-1);
//            reverseArr(arr, 0, arr.length-1);
//        }
//
//        public static void reverseArr(int[] arr, int left, int right){
//            while(left < right){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }


    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> queries = Arrays.asList(0, 1);
        a = circularArrayRotation(a, 3, queries);
        System.out.println(a);
    }


//    public static List<Integer> optimal(List<Integer> a, int k){
//
//        List<Integer> ans = new ArrayList<>();
//
//        k = k % a.size();
//
//        reverseList(a, 0, a.size()-k-1);
//        reverseList(a, a.size()-k, a.size()-1);
//        reverseList(a, 0, a.size()-1);
//
//        return ans;
//    }



    public static void reverseList(List<Integer> list, int left, int right){

        while(left < right){

            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }


    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        List<Integer> ans = new ArrayList<>();

        k = k % a.size();
        reverseList(a, 0, a.size() - k - 1);
        reverseList(a, a.size() - k, a.size() - 1);
        reverseList(a, 0, a.size() - 1);

//        for (int index : a) {
//            ans.add(a.get(index));
//        }

        for (int i = 0; i < queries.size(); i++) {
            ans.add(a.get(queries.get(i)));
        }

        System.out.println("ans");
        System.out.println(ans);
        return ans;

    }

}



//
//public static void reverseList(List<Integer> list, int left, int right){
//    while(left < right){
//
//        int temp = list.get(left);
//        list.set(left, list.get(right));
//        list.set(right, temp);
//        left++;
//        right--;
//    }
//}
//

