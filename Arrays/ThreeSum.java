import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ThreeSum {
    
    public  List<List<Integer>> threeSum(int[]nums){
        Arrays.sort(nums);
        List<List<Integer>>result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            twoSum(nums,i,result);
        }
        return result;
    }


    void  twoSum(int[]nums,int i,List<List<Integer>>result){
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum<0){
                left++;
            }
            else if(sum>0){
                right--;
            }
            else{
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                }
            }
            left++;
            right--;
        }
            return;
    }



    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1,0,1,2,1,-1,4};
        List<List<Integer>>result = solution.threeSum(nums); 
        System.out.println(result);   
    }

    


}
