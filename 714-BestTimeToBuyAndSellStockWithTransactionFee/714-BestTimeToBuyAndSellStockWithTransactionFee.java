// Last updated: 2/26/2026, 9:56:12 AM
class Solution {
    int n;

    public int maxProfit(int[] prices, int fee) {
        n = prices.length;
        int dp[][] = new int[n + 1][2];
        for(int i = 0; i < n; i++){
            dp[i][0] = 0;
            dp[i][1] = 0;
        }
        for(int i = n-1; i>=0; i--){
            for(int buy = 0; buy <=1; buy++){
                if(buy == 1){
                    int take = -prices[i] + dp[i+1][0];
                    int notTake = dp[i+1][1];
                    dp[i][buy] = Math.max(take,notTake);
                }else{
                    int take = prices[i] - fee + dp[i+1][1];
                    int notTake = dp[i+1][0];
                    dp[i][buy] = Math.max(take,notTake);
                }
            }
        }
        return dp[0][1];
        
    }
}