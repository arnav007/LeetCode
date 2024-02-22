class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;

        int ins=0;
        int count=1;
        for(int i=0; i< chars.length-1; i++){
            boolean same =false;
            if(chars[i] == chars[i+1]){
                same=true;
                count++;
                if(i < chars.length-2){
                    continue;
                }
            }

            chars[ins++] = chars[i];
            if(count>1){
                char[] temp = (""+count).toCharArray();
                for(char r: temp){
                    chars[ins++]= r;
                }
            }

            if(i == chars.length-2){
                if(!same){
                    chars[ins++] = chars[i+1];
                }
                break;
            }

            count = 1;
        }

        // chars[ins++] = chars[chars.length-2];
        // if(count>1){
        //     char[] temp = (""+count).toCharArray();
        //     for(char r: temp){
        //         chars[ins++]= r;
        //     }
        // }else{
        //     chars[ins++] = chars[chars.length-1];
        // }

        return ins;

    }
}