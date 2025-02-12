package ArraysProblem;

import java.util.Arrays;

public class ArrangeBySignVariety2 {


    public static void main(String[] args) {

        int[] arr = { 2, 3, -1, 4, -2, -6, -1};
        int[] newArr = new int[arr.length];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0){
                if (i != 0){
                    if (newArr[pos] == 0){
                        newArr[pos] = arr[i];
                        pos += 2;
                    }else {
                        if (newArr[pos-1] == 0){
                           pos--;
                           newArr[pos] = arr[i];
                           pos++;
                       }

                    }

                }else {
                    if (newArr[neg -1] == 0){
                        neg--;
                        newArr[neg] = arr[i];
                        neg++;
                    }else {
                        newArr[neg] = arr[i];
                        neg += 2;
                    }
                }
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
