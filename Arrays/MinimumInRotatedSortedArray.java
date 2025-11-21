public class MinimumInRotatedSortedArray {
    
    public static int findMin(int[] nums){
        int left =0;
        int right = nums.length-1;
        if(nums[left]<=nums[right]){
            return nums[left];
        }
        while(left<=right){
            int mid = (left+right)/2;
            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(mid<nums.length-1 && nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }
            if(nums[left]<=nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int minNumber = findMin(nums);
        System.out.println(minNumber);     
    }


}
