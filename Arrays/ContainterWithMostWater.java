
class ContainerWithMostWater{

    public static int  mostWater(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int maxArea =0;
        while(left<right){
            int width = right-left;
            int area = Math.min(nums[left],nums[right])*width;
            maxArea = Math.max(area,maxArea);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int maxArea = mostWater(nums);
        System.out.println(maxArea);
    }


}
