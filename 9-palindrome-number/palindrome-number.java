class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }

        int updatedNum = 0;
        int test = x;

        while(test != 0)
        {
            updatedNum = (updatedNum * 10) + (test % 10);
            test = test/10;
        }

        return updatedNum == x;
    }
}