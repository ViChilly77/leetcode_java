class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0;
        int current = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                current += 1;
                maxNum = Math.max(maxNum, current);
            }
            else if(nums[i] == 0){
                current = 0;
            }
        }
        return maxNum;
    }
}