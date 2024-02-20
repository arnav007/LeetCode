class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int sum2=0;
        for(int i=0;i<nums.length;sum2+=nums[i++]){
            int rem=sum-nums[i];
             if ((sum2 * 2) == (sum - nums[i])){
                return i;
            }
        
        }
        return -1;
    }
}