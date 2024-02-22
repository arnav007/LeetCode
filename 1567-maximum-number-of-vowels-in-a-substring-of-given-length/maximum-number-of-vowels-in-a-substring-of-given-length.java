class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int max=0;
        int strLen=s.length();
        int c=0;
        boolean wasVowel=false;
        for(int i=0;i<strLen;i++){
            if(i>=k){
                if(wasVowel){
                    c--;
                }
                wasVowel=vowels.indexOf(s.charAt(i-k+1))>=0;
            }

            if(vowels.indexOf(s.charAt(i))>=0){
                if(i==0) wasVowel=true;
                c++;
            }

            if(c==k){
                return c;
            }
            max=max>c?max:c;
        }
        return max;
    }
}