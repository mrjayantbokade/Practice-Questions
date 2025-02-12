package ArraysProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {


    public static ArrayList<Integer> findNextGreaterPermutationArrayList(ArrayList<Integer> arrList){

        int dip = -1;
        for (int i = arrList.size()-2; i >= 0 ; i--) {
            if (arrList.get(i) < arrList.get(i+1)){
                dip = i;
                break;
            }
        }

        if (dip == -1){
            Collections.reverse(arrList);
            return arrList;
        }

        for (int i = arrList.size()-1; i > dip; i--) {
            if (arrList.get(i) > arrList.get(dip)){
                int temp = arrList.get(i);
                arrList.set(i, arrList.get(dip));
                arrList.set(dip, temp);
                break;
            }
        }

        List<Integer> sublist = arrList.subList(dip+1, arrList.size()-1);
        Collections.reverse(sublist);


        return arrList;
    }



    public static int[] findNextGreaterPermutation(int[] arr){
        int dip = -1;

        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]){
                dip = i;
            }
        }

        if (dip == -1){
            reverseArr(arr, 0, arr.length-1);
            return arr;
        }

        for (int i = arr.length-1; i > dip; i--) {
            if (arr[i] > arr[dip]){
                int temp = arr[i];
                arr[i] = arr[dip];
                arr[dip] = temp;
                break;
            }
        }

        reverseArr(arr, dip+1, arr.length-1);
        return arr;
    }

    private static void reverseArr(int[] arr, int left, int right) {

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 4, 3, 0, 0};
        ArrayList<Integer> arrList = new ArrayList(Arrays.asList(2, 1, 5, 4, 3, 0, 0));

        System.out.println(arrList);
        findNextGreaterPermutationArrayList(arrList);
        System.out.println(arrList);

//        System.out.println(Arrays.toString(arr));
//        findNextGreaterPermutation(arr);
//        System.out.println(Arrays.toString(arr));




    }
}
