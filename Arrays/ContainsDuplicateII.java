import java.util.HashMap;

public class ContainsDuplicateII {
    
    public static boolean duplicate(int[] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        boolean isDuplicate=duplicate(nums,k);
        System.out.println(isDuplicate);
    }


}
