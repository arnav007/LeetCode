class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int capacity=0;
        int minH=0;
        for(int i=0, j=height.length-1;i<j;){
            minH=Math.min(height[i], height[j]);
            capacity = (j-i)*minH;
            max = Math.max(max,capacity);
            while(i<j && height[i] <= minH) i++;
            while(i<j && height[j] <= minH) j--;
        }
        return max;
    }
}