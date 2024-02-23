class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int capacity=0;
        for(int i=0, j=height.length-1;i<j;){
            capacity = (j-i)*Math.min(height[i], height[j]);
            max = Math.max(max,capacity);
            if(height[i] < height[j]) i++;
            else if(height[j] < height[i]) j--;
            else {
                i++;j--;
            }
        }
        return max;
    }
}