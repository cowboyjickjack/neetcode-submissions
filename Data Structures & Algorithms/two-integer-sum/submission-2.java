class Solution {

    public int[] twoSum(int[] nums, int target) {
        
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }
        // }

        // return nums;

        HashMap<Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            // if we have a hit
            if(complementIndex != null){
                return new int[] {complementIndex, i};
            }
            // if no hit, we must calc complement and add to map
            complements.put(target - nums[i], i);
        }

        return nums;
        
    }
}
