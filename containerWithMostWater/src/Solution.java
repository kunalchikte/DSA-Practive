public class Solution {
    public int cointainerWithMostWater(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int maxArea = 0;

        while(left<right){
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);

            if(nums[left] > nums[right]){
                right--;
            } else if (nums[left] < nums[right]) {
                left++;
            }else{
                right--;
                left++;
            }
        }
        return maxArea;
    }
}
