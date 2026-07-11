class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        

        Arrays.sort(nums);
        //nums = [-4, -1, -1, 0, 1, 2]
        HashSet<List<Integer>> triplets = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            //List<Integer> list = new ArrayList<>();

            while(j < k){

                int sum = - (nums[j] + nums[k]);

                if(sum == nums[i]){
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if(sum > nums[i]){
                    k--;
                } else if(sum < nums[i]){
                    j++;
                }
            }

        }
        return new ArrayList<>(triplets);
    }
}