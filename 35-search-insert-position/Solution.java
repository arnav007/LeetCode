/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (49.96%)
 * Likes:    18979
 * Dislikes: 903
 * Total Accepted:    4.9M
 * Total Submissions: 9.5M
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums contains distinct values sorted in ascending order.
 * -10^4 <= target <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = solution.searchInsert(nums, target);
        System.out.println(result); // Output: 2
    }


    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            
            if (nums[mid] < target) {
                left = mid + 1;
            } 
            
            if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }
}
// @lc code=end

