public class MaximumProductSubarray {
    
    public static int maxProductSubarray(int[] nums){
        int min = nums[0] ;
        int max = nums[0];
        int result = 0;
        for(int i=1 ; i< nums.length ; i++){
            int current = nums[i];
            int premax = max;
            int premin = min;
            max = Math.max(current,Math.max(premax*current,premin*current));
            min = Math.min(current, Math.min(premin*current,premax*current));
            result = Math.max(max,min);
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums ={1,2,3,4};
        int max = maxProductSubarray(nums);
        System.out.println(max);
    }

}
