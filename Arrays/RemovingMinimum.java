public class RemovingMinimum {

    public static int removingMinAndMax(int[]nums){
        if(nums.length==1){
            return 1;
        }
        int minIdx = 0 , maxIdx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[minIdx]){
                minIdx=i;
            }
            if(nums[i]>nums[maxIdx]){
                maxIdx =i;
            }
        }
        if(minIdx>maxIdx){
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }
        int deleteFromLeft = maxIdx+1;
        int deleteFromRight = nums.length-minIdx;
        int deleteFromBothSides = (minIdx+1)+(nums.length-maxIdx);
        return Math.min(deleteFromBothSides,Math.min(deleteFromLeft,deleteFromRight));
    }
    public static void main(String[] args) {
        int []nums = {2,10,7,5,4,1,8,6};
        int output = removingMinAndMax(nums);
        System.out.println(output);
    }
}
