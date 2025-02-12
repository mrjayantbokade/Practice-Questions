package ArraysProblem;

import java.util.*;

public class UnionArrays {

    public static void main(String[] args) {

        int[] arr1 = { 0, 1, 1, 2, 3, 4, 5};
        int[] arr2 = { 2, 3, 4, 4, 5};

        Set<Integer> s1 = new HashSet<>();
        for (int num: arr1){
            s1.add(num);
        }
        for (int num: arr2){
            s1.add(num);
        }

        int[] newArr = new int[s1.size()];

        int i = 0;
        for (int num: s1){
            newArr[i] = num;
            i++;
        }


//        Map<Integer, Integer> freqMap = new HashMap<>();
//        freqMap.put(1, freqMap.getOrDefault(1, 0)+1);
//        System.out.println(freqMap);
//        System.out.println(freqMap.get(1));


        System.out.println(Arrays.toString(newArr));

    }
}
