package ArraysProblem;

public class MaximumSubarraySum {
    public static void main(String[] args) {


        int[] arr = {-2, -1};

        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int maximum = Integer.MIN_VALUE;

        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maximum){
                maximum = sum;
                ansEnd = i;
                ansStart = start;
            }

            if (sum < 0){
                sum = 0;
                start = i+1;
            }

        }







        System.out.println("Maximum Sub is = " + maximum);
        System.out.println("From " + ansStart + " to " + ansEnd);
    }
}
