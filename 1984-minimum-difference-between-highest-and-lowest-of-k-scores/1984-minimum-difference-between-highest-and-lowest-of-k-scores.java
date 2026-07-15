class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);

        int sum = 0;
        int minDiff = nums[k-1] - nums[0];

        for(int i=0; i<k; i++){
            sum = sum + nums[i];
        }

        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] + nums[i-k];
            minDiff = Math.min((nums[i] - nums[i-k+1]), minDiff);
        }
        return minDiff;
    }
}