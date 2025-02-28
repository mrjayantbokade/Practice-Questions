package TCS;

public class LeaderPrep1 {
    public static void main(String[] args){


        int[] arr = { 7, 4, 8, 2, 9};
        System.out.println(optimal(arr));

    }




    public static int optimal(int[] arr){

        if (arr.length == 0) return  -1;

        int maximum = arr[0];
        int count = 1;

        for(int i=1; i<arr.length; i++){
            if (arr[i] > maximum){
                count++;
                maximum = arr[i];
            }
        }

        return count;
    }
}
