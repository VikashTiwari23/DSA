import java.util.HashMap;

public class SumOfMaxFrequency {
    
    public static int CountandSum(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int output = 0;
        int max= 0;
        for(int n : map.values()){
            max = Math.max(max,n);
        }
        for(int n : map.values()){
            if(n==max){
                output+=n;
            }
        }
        return output;
    }
    

    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4}; // output = 4 
        int sum = CountandSum(nums);
        System.out.println(sum);
    }


}
