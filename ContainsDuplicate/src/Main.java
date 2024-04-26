//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};

        Solution s = new Solution();
        boolean ans = s.containsDuplicate(nums);
        System.out.println(ans);
    }
}