class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    helper(nums,0,new ArrayList<>(), result);
    return result;
    }
    public void helper(int nums[], int idx, List<Integer> dp, List<List<Integer>> result){
        
        if(idx==nums.length){   
            result.add(new ArrayList<>(dp));
            return;
        }

        //pick 
        dp.add(nums[idx]);
        helper(nums, idx+1, dp, result);
        dp.remove(dp.size()-1);
        //nonpick
        helper(nums, idx+1, dp, result);
    }
}