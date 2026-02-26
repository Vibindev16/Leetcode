// Last updated: 2/26/2026, 9:57:08 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int tar = target;
        int arr [] = new int[2];
        for(int  i = 0;  i< nums.length ; i++){
            for(int j = i + 1; j < nums.length ; j++){
                if(nums[j] == target - nums[i]){
                return new int[] {i,j};
            }
            }
        }
        return new int[] {};
    }
}