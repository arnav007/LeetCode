class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int w1Size = w1.length;
        int w2Size = w2.length;
        char[] res = new char[w1Size+w2Size];
        for(int i=0, j=0; ; i++){
            if(i<w1Size){
                res[j++]=w1[i];
                if(i<w2Size){
                    res[j++]=w2[i];
                }
                continue;
            }

            if(i<w2Size){
                res[j++]=w2[i];
                continue;
            }

            break;
        }
        return new String(res);
    }
}