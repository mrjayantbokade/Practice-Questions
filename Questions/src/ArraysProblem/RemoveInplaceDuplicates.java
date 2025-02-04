package ArraysProblem;

public class RemoveInplaceDuplicates {


    public static void main(String[] args) {
        int[] arr = {1,2, 3, 3, 3, 4, 5, 66};

        int index = 0;
        int i = 1;
        while (i != arr.length){
            if (arr[index] == arr[i] ){
                i++;
            }else {

                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        for (int num: arr){
            System.out.print(num + ", ");
        }


        System.out.println();
        System.out.println(index+1);
    }
}
