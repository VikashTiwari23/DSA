import java.util.Arrays;

public class ProductPrefixSuffix {

    
    public static int[] productPrefixSuffix(int[]nums){
        int left = 1 , right = 1;
        int [] result = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            result[i] = left;
            left = nums[i]*left;
        }
        for(int i = nums.length-1; i>=0 ; i--){
            result[i] = right *result[i];
            right = right *nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int[] result = productPrefixSuffix(nums);
        System.out.println(Arrays.toString(result));
    }


}
 