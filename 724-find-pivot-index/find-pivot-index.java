class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                sum2+=nums[i-1];
            }
            int rem=sum-nums[i];
            if(rem%2 ==0 && sum2==rem/2){
                return i;
            }
        
        }
        return -1;
    }
}