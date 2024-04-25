import java.util.HashMap;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int[] nums = new int[]{2,7,11,15};
       int target = 9;

       int[] returnArray = new int[]{};
       Solution sol = new Solution();

       returnArray = sol.twoSum(nums, target);

        System.out.println(Arrays.toString(returnArray));

    }
}