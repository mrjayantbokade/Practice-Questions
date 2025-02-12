import java.util.Arrays;

public class LongestConsecutiveSequence {


    public static int brute(int[] arr){

        int longest = 1;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {


        }

        return longest;
    }
    public static void main(String[] args) {

        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(brute(arr));

    }
}
