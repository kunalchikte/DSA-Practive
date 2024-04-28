import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//        You must write an algorithm that runs in O(n) time and without using the division operation.
//
//        Example 1:
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]

        int[] nums = new int[]{10, 3, 5, 6, 2};

        Solution s = new Solution();

        int[] solutionArray = s.productOfArray(nums);

        System.out.println(Arrays.toString(solutionArray));


    }
}