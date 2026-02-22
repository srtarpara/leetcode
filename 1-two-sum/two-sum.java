class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++)
        {
            int finder = target - nums[i];

            for(int j = i + 1; j < nums.length; j++)
            {
                if (finder == nums[j])
                {
                    int[] returnValue = {i,j};
                    return returnValue;
                }
            }
        }
        
        int[] returnValue1 = {0,0};
        return returnValue1;
    }
}