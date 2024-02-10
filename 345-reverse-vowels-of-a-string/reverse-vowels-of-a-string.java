class Solution {
    public String reverseVowels(String s) {

        int j = s.length()-1;

        char[] str = s.toCharArray();
        boolean f=false;
        char t = 'x';
        for(int i=0; i<j;i++, j--){
            f=false;
            while(i<j && str[i] != 'a' && str[i] != 'e' && str[i] != 'i' && str[i] != 'o' && str[i] != 'u'
            && str[i] != 'A' && str[i] != 'E' && str[i] != 'I' && str[i] != 'O' && str[i] != 'U'){
                i++;
            }

            while(i<j && str[j] != 'a' && str[j] != 'e' && str[j] != 'i' && str[j] != 'o' && str[j] != 'u'
             && str[j] != 'A' && str[j] != 'E' && str[j] != 'I' && str[j] != 'O' && str[j] != 'U'){
                j--;
            }

            if(i<j){
                t = str[i];
                str[i] = str[j];
                str[j] = t;
            }
        }

        return new String(str);
        
    }
}