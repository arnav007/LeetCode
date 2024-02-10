class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0) return true;
        
        if(flowerbed.length == 1){
            return ((flowerbed[0]==0 && n==1));
        }

        if(n > (1+flowerbed.length/2)){
            return false;
        }

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==1){
                i++;
                continue;
            }

            if((((i==0) || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0))){
                if(--n == 0){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}