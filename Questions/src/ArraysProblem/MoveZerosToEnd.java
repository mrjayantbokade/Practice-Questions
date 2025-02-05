package ArraysProblem;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {


        int[] arr = {1, 0, 2, 3, 4, 0, 0, 4, 5, 1};
//        int left = 0;
//        int right = arr.length-1;

        System.out.println(Arrays.toString(arr));

//        this is when
//        no constraints
//        no case
//        no order maintained

//        while (left <= right){
//            if (arr[left] == 0 && arr[right] != 0){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//
//            if (arr[left] != 0){
//                left++;
//            }
//
//            if (arr[right] == 0){
//                right--;
//            }
//        }




//        optimal approach
//        order of non zeros matters
        int position = 0;
        int i = 1;
        while (i < arr.length){
            if (arr[position] == 0 && arr[i] != 0){

                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;
                position++;
                if (i != arr.length-1) i++;
            }
            if (arr[position] != 0 && arr[i] == 0){
                i++;
                position++;
            }

            if (arr[position] == 0 && arr[i] == 0){
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
