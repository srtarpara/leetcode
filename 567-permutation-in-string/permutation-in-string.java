class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int uniqueCharacter = 0;
        int[] letterFrequency = new int[26];

        for (char c : s1.toCharArray())
        {
            int index = c - 'a';
            letterFrequency[index] = letterFrequency[index] + 1;

            if(letterFrequency[index] == 1)
            {
                uniqueCharacter++;
            }
        }

        for(int i = 0; i < s2.length(); i++)
        {
            int currentIndex = s2.charAt(i) - 'a';
            letterFrequency[currentIndex] = letterFrequency[currentIndex] - 1;

            if(letterFrequency[currentIndex] == 0)
            {
                uniqueCharacter--;
            }

            if(i >= s1.length())
            {
                int leftLetterIndex = s2.charAt(i - s1.length()) - 'a';
                letterFrequency[leftLetterIndex] = letterFrequency[leftLetterIndex] + 1;

                if(letterFrequency[leftLetterIndex] == 1)
                {
                    uniqueCharacter++;
                }
            }

            if(uniqueCharacter == 0)
            {
                return true;
            }
        }

        return false;
    }
}