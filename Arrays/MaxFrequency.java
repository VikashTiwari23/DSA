import java.util.*;

public class MaxFrequency {
    
    public static int[] maxFrequency(int[] nums,int k){
        if(k==nums.length){
            return nums;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Queue<Integer> heap = new  PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int []ans = new int[k];
        for(int i = 0 ; i<ans.length;i++){
            ans[i] = heap.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={1,1,1,2,2,3,3,4,4,4,4};
        int k = 2; 
        int [] maxFrequency = maxFrequency(nums, k);
        System.out.println(maxFrequency);
    }


}
