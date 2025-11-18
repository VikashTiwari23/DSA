public class MaximumSumSubarray {
    public static int maximumSubarray(int[] nums){
        int sum = 0 ;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum =0 ;
            }
            else{
                sum += nums[i];
                max = Math.max(sum,max);
            }
        } 
        return max;
    }
    public static void main(String[] args) {
        int []nums = {-1,-5,2,-8,4,0,-1,0,5,-7,6};
        int max = maximumSubarray(nums);
        System.out.println(max);
    }
}
