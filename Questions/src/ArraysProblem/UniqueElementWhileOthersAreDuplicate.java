package ArraysProblem;

public class UniqueElementWhileOthersAreDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
        }

        System.out.println(sum);

    }
}
