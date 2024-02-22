class Solution {
    public boolean increasingTriplet(int[] nums) {
        // if(nums.length < 3) return false;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int x: nums){
            if(x<=min1) min1 = x;
            else if(x<=min2) min2 = x;
            else return true;
        }
        return false;

    }
}