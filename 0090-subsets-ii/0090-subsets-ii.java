import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);   // important
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void helper(int[] nums, int idx, List<Integer> dp, List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(dp));
            return;
        }

        // PICK
        dp.add(nums[idx]);
        helper(nums, idx + 1, dp, result);
        dp.remove(dp.size() - 1);

        // SKIP DUPLICATES before NON-PICK
        while (idx + 1 < nums.length && nums[idx] == nums[idx + 1]) {
            idx++;
        }

        // NON-PICK
        helper(nums, idx + 1, dp, result);
    }
}