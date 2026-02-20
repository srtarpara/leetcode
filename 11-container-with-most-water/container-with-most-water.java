class Solution {
    public int maxArea(int[] height) {
        int multipledValue = 0;
        int maxWater = 0;

        int left = 0;
        int right = height.length - 1;

        while(left < right)
        {
            multipledValue = Math.min(height[left], height[right]);
            maxWater = Math.max(multipledValue*(right-left), maxWater);

            if(height[left] > height[right])
            {
                right--;
            }

            else
            {
                left++;
            }
        }

        return maxWater;
    }
}