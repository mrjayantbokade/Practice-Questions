package ArraysProblem;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {


    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 3, 3};
        Set<Integer> s = new HashSet<>();
        for (int num: arr){
            s.add(num);
        }

        int i = 0;
        for (int num: s){
            arr[i] = num;
            i++;
        }

        for (int num: arr){
            System.out.println(num);
        }
        System.out.println(i);






//        second approach


        
    }
}
