public class BuyAndSellStocks {
    public static int BuyAndSellStock(int[] nums){
        int profit = 0 , maxProfit = 0;
        int min = nums[0];
        for(int i =0 ;i< nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            else{
                profit = nums[i]-min;
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int []nums={4,7,11,3,2,5,1,20,34,4,2,45,-1,0};
        int profit = BuyAndSellStock(nums);
        System.out.println(profit);
    }


}
