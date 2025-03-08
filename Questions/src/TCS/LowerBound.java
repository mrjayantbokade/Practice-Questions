package TCS;

public class LowerBound {

    public static void lowerBound(int[] arr, int left, int right, int target) {

        int mid = (left + right) / 2;

        while (left <= right) {

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            mid = (left + right) / 2;
        }

        System.out.println(left);
    }


    public static void main(String[] args) {


        int[] arr = {3, 5, 8, 15, 19, 19};

        int left = 0;
        int right = arr.length - 1;
        int target = 20;


        lowerBound(arr, left, right, target);

    }
}



