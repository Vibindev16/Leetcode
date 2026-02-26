// Last updated: 2/26/2026, 9:56:14 AM
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        ans=(double) maxSum / k;
        return ans;
    }
}