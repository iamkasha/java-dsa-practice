class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        for(int i=0; i<k; i++){
            sum = sum + nums[i];
        }

        double maxAvg = sum/k;

        for(int j=k; j<nums.length; j++){
            sum = sum + nums[j] - nums[j-k];
            maxAvg = Math.max(maxAvg, sum/k);
        }
        return maxAvg;
    }
}