package ArraysProblem;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        int count = 0;
        int elem = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                elem = nums[i];
            }else if(nums[i] == elem){
                count++;
            }else{
                count--;
            }
        }

        int cnt1 = 0;
        for(int num: nums){
            if(num == elem){
                cnt1++;
            }
        }
//
//        if(cnt1 > nums.length) return elem;
//
//        return elem;

        System.out.println(elem);
    }
}
