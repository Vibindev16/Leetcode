// Last updated: 2/26/2026, 9:56:47 AM
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1 ; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}