import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        int complement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{complement, i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
