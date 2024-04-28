//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Given an integer array nums, find the subarray  with the largest sum, and return its sum.
//
//        Example 1:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        Solution s = new Solution();

        int sol = s.MaximumSumOfContinuosSubArray(nums);
        System.out.println(sol);
    }
}