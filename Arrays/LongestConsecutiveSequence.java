import java.util.HashSet;

public class LongestConsecutiveSequence {
    
    public static int longestSequence(int [] nums){
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longestSub = 1;
        for(int num : nums){
            if(set.contains(num)){
                continue;
            }
            else{
                int currentNum = num;
                int currentSub = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub,currentSub);
            }
        }
        return longestSub;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int total = longestSequence(nums);
        System.out.println(total);
    }


}
