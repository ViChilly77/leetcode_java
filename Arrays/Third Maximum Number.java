class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
         
        

        int distCount = 1;
        int last = nums[nums.length-1];

        while (nums.length > 2)

        for (int i = nums.length - 2; i >= 0; i--)
        {
            if (nums[i] == last)
            {
                continue;
            }
        
        distCount ++;
        last = nums[i]; 
            if (distCount == 3)
            {
                return nums[i];
            }      

        }
    

         return nums[nums.length - 1];       
    }
   
     
}