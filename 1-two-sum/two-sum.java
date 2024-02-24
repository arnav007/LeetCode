class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }

        return null;


    //     Map<Integer,Integer> map = new HashMap<>();
    //     int rem=0;
    //     for(int i=0; i< nums.length;i++){
    //         rem = target-nums[i];
    //         Integer idx=map.get(rem);
    //         if(idx==null){
    //             map.put(nums[i],i);
    //         }else{
    //             return new int[] {idx,i};
    //         }
    //     }
    //     return null;


        // for(int i=1;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if((nums[j-i]+nums[j]) == target){
        //             return new int[]{j-i,j};
        //         }
        //     }
        // }

        // return null;  
    }
}