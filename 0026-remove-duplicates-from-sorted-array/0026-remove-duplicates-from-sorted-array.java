class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        int k=1;

        while(i < nums.length-1){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i+1];
                k++;
            }
            i++;
        }
        return k;
    }
}