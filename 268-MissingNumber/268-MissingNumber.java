// Last updated: 2/26/2026, 9:56:29 AM
class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;

        for(int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }
}