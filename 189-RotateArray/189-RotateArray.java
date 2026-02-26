// Last updated: 2/26/2026, 9:56:40 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotatedArray =  new int[n];

        for(int i=0; i < n; i++)
        {
            rotatedArray[(k + i) % n] = nums[i];
        }
        for(int i=0; i < n; i++)
        {
            nums[i] = rotatedArray[i];
        }
    }
}