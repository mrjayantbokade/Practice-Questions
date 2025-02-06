import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class SortZerosOnesTwos {
    public static void main(String[] args) {


        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 1, 2, 2, 1, 2, 2, 1};

        System.out.println(Arrays.toString(arr));

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int zeros = freqMap.get(0);
        int ones = freqMap.get(1);
        int twos = freqMap.get(2);

        System.out.println(freqMap);

        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }

        for (int j = zeros; j < (zeros+ones); j++) {
            arr[j] = 1;
        }

        for (int z= (zeros+ones); z < arr.length; z++) {
            arr[z] = 2;
        }


        System.out.println(Arrays.toString(arr));
    }
}
