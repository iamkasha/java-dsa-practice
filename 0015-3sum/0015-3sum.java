class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        HashSet<List<Integer>> triplets = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                List<Integer> temp = new ArrayList<>();
                if(sum == 0){
                    temp = List.of(nums[i], nums[j], nums[k]);
                    triplets.add(temp);
                    j++;
                    k--;
                } else if(sum > 0){
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(triplets);
    }
}