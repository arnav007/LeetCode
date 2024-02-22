class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        
        for(int x: nums){
            if(x<=i) i = x;
            else if(x<=j) j = x;
            else return true;
        }
        return false;

    }
}