class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        int[] letterFrequency = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            letterFrequency[s.charAt(i) - 'a'] = letterFrequency[s.charAt(i) - 'a'] + 1;
            letterFrequency[t.charAt(i) - 'a'] = letterFrequency[t.charAt(i) - 'a'] - 1;
        }

        for(int i = 0; i < 26; i++)
        {
            if(letterFrequency[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}