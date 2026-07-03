class Solution {
    public boolean compare(String haystack, String needle, int idx) {
        int n1 = haystack.length();
        int n2 = needle.length();

        for (int i = 0; i < n2; i++) {
            if (idx + i >= n1) return false;

            if (haystack.charAt(idx + i) != needle.charAt(i))
                return false;
        }

        return true;
    }

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0)
            return 0;

        int n1 = haystack.length();
        int n2 = needle.length();

        for (int i = 0; i <= n1 - n2; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i))
                    return i;
            }
        }

        return -1;
    }
}