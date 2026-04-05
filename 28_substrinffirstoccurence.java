class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        String word = "";

        while (i <= haystack.length() - needle.length())
        {
            word = haystack.substring(i, i + needle.length());

            if (word.equals(needle)) {
                return i;
            }

            i++;
        }

        return -1;
    }
}