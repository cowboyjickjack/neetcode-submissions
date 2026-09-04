class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0; // if nothing, return nothing

        int validSize = 0; // front of array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[validSize] = nums[i];
                validSize++; // put valid elements to the front
            }
        }

        return validSize;
    }
}