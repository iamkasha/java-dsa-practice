class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] sqrArr = new int[n];
        int i=0;
        int j= n-1;

        for(int pos = n-1; pos>=0; pos--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                sqrArr[pos] = nums[i] * nums[i];
                i++;
            } else{
                sqrArr[pos] = nums[j] * nums[j];
                j--;
            }
        }
        return sqrArr;
    }
}