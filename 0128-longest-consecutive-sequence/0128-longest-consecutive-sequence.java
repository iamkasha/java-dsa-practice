class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int longestSeq = 0;

        for(int num : set){
           if(!set.contains(num-1)){
                int count = 1;
                int curNum = num;
                while(set.contains(curNum+1)){
                    count++;
                    curNum = curNum+1;
                }
                longestSeq = Math.max(count, longestSeq);
           } 
        }
        return longestSeq;
    }
}