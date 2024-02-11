class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";

        int s1L= str1.length();
        int s2L= str2.length();

        while(s1L!=0 && s2L!=0){
            if(s1L > s2L){
                int temp = s1L;
                s1L = s2L;
                s2L = temp % s2L;
                continue;
            }

            int temp = s2L;
            s2L = s1L;
            s1L = temp % s1L;
        }

        int len = (s1L == 0) ? s2L : s1L;
        return str1.substring(0, len);


    }
}