import java.util.Arrays;

public class ReverseStringArray {


    public static void main(String[] args) {


        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length-1;


        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

    }

}
