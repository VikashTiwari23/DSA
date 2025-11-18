import java.util.Arrays;

public class TwoSumII {
    
    public int[] TwoSum(int[]nums, int target){
        int left = 0 , right = nums.length-1;
        for(int i = 0 ;i < nums.length; i++){
            int current = target - nums[i];
            int sum = nums[left]+nums[right];
            if(sum<current) left++;
            if(sum>current) right--;
            if(sum==current){
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        TwoSumII solution = new TwoSumII();
        int [] nums = {2,5,6,8,12,14,19};
        int target = 24;
        int[] result = solution.TwoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    

}
