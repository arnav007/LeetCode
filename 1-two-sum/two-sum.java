class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int rem=0;
        for(int i=0; i< nums.length;i++){
            rem = target-nums[i];
            Integer idx=map.get(rem);
            if(idx==null){
                map.put(nums[i],i);
            }else{
                return new int[] {idx,i};
            }
        }

        return new int[] {-1,-1};
    }
}