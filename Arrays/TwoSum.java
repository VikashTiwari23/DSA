import java.util.HashMap;
import java.util.Arrays;

class TwoSum{
    public int[] Twosum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ;i< nums.length ;i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int []nums={4,3,6,8,1,7,9};
        int target = 17;
        int [] result = solution.Twosum(nums,target);
        System.out.println(Arrays.toString(result));
    }

}