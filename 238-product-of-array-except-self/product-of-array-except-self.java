class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int mul = 1;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0){
                zeros++;
                if(zeros > 1){
                    break;
                }
                continue;
            }
            
            mul = mul * nums[i];
        }

        int[] result = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            if(((zeros == 1) && (nums[i] != 0)) || zeros > 1){
                result[i] = 0;
                continue;
            }
            
            if((nums[i] == 0)){
                result[i] = mul;
            }else{
                result[i] = mul/nums[i];
            }
            
       }

       return result;
    }
}