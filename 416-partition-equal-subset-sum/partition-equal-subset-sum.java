class Solution {
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i=0; i<nums.length;i++){
            s+=nums[i];
        }

        if(s%2 !=0) return false;

        s/=2;
        return canSum(nums, s, 0, new Boolean[nums.length+1][s+1]);
    }

    boolean canSum(int[] nums, int sum, int i, Boolean[][] ans){
        if(i>=nums.length || sum < 0) {
            return false;
        }

        if(sum==0) {
            return true;
        }

        if(ans[i][sum] !=null) return ans[i][sum];

        return ans[i][sum] = canSum(nums, sum-nums[i], i+1, ans) || canSum(nums, sum, i+1, ans);
        // return ans[i][sum];
    }


}