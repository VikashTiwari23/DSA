public class TrappingRainWater {
    
    public static int trappedWater(int[] nums){
        int left =0 ;
        int right = nums.length -1;
        int leftMax = nums[0];
        int rightMax = nums[right];
        int total =0;
        while(left<right){
            if(nums[left]<nums[right]){
                leftMax = Math.max(leftMax,nums[left]);
                if(leftMax-nums[left]>0){
                    total = total + leftMax - nums[left];
                }
                left++;
            }
            else{
                rightMax = Math.max(rightMax,nums[right]);
                if(rightMax-nums[right]>0){
                    total += rightMax - nums[right];
                }
                right--;
            }   
        }
        return total;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int boxes = trappedWater(nums);
        System.out.println(boxes);
    }


}
