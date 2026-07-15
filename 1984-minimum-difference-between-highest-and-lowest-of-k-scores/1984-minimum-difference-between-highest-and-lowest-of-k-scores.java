class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int minDiff = nums[k-1] - nums[0];

        for(int i=k; i<nums.length; i++){
            minDiff = Math.min((nums[i] - nums[i-k+1]), minDiff);
        }
        return minDiff;
    }
}