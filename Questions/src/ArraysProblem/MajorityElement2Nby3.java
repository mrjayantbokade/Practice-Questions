package ArraysProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2Nby3 {


    public static void main(String[] args) {
        int[] arr = {2,2};


        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if (map.get(arr[i]) > arr.length/3){
                if (!list.contains(arr[i])){
                    list.add(arr[i]);

                }
            }
            if (list.size() == 2){
                break;
            }

        }


        System.out.println(list);

    }
}
