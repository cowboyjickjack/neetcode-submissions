class Solution {
    public int[] replaceElements(int[] arr) {
        final int[] result = new int [arr.length];
        Arrays.fill(result, -1); // append to end

        int currentMax = -1;
        
        for(int i = arr.length -1; i >= 0; i--){
            result[i] = currentMax; // not including first element
            currentMax = Math.max(currentMax, arr[i]);
        }
        return result;
    }
}