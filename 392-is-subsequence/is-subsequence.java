class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen= s.length();
        int tLen= t.length();
        int j = 0;
        for(int i = 0; i < tLen && j<sLen; i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
        }

        return j==sLen;
    }
}