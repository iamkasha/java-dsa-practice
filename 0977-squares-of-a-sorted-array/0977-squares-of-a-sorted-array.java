class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] sqArr = new int[n];
        int left = 0;
        int right = n-1;
        int pos = n-1;
        while(left <= right){
            if((nums[left] * nums[left]) < (nums[right] * nums[right])){
                sqArr[pos] = nums[right] * nums[right];
                pos--;
                right--;
            } else {
                sqArr[pos] = nums[left] * nums[left];
                pos--;
                left++;
            }
        }
        return sqArr;
    }
}