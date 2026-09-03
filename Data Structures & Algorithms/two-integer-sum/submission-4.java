class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if (nums[i] + nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }

        // }

        // return nums;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Integer mapIndex = map.get(nums[i]);
            if (mapIndex != null){
                return new int[] {mapIndex, i};
            }
            map.put(target - nums[i], i);
        }

        return nums;

    }
}
