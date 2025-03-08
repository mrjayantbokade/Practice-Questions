package TCS;

public class RotatedSorted {

    public static int rBS(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        while (left <= right){

            if (arr[mid] == target) return mid;

            if (arr[left] <= arr[mid] && arr[left] <= target && target <= arr[mid]){
                right = mid-1;
            }else {
                left = mid + 1;
            }

            mid = (left+right)/2;
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4};

        System.out.println(rBS(arr, 2));
        System.out.println(rBS(arr, 5));
        System.out.println(rBS(arr, 6));
        System.out.println(rBS(arr, 1));
        System.out.println(rBS(arr, 2));
        System.out.println(rBS(arr, 3));
        System.out.println(rBS(arr, 4));
        System.out.println(rBS(arr, 11));
    }
}
