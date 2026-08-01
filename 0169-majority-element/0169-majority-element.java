class Solution {
    public int majorityElement(int[] nums) {

    //     int n = nums.length;
    //     int maj = nums[0];

    //     Map<Integer, Integer> map = new HashMap<>();
        
    //     for(int i=0; i<n; i++){
            
    //         map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

    //         if(map.get(nums[i]) > n/2){
    //             maj = nums[i];
    //         }
    //     }
    //     return maj;
    // }

            int maj = nums[0];
            int count = 1;

            for(int i=1; i<nums.length; i++){

                if(count == 0){
                    maj = nums[i];
                    count = 1;
                } else if(nums[i] == maj){
                    count++;
                } else {
                    count--;
                }

            }
            return maj;
    }

}