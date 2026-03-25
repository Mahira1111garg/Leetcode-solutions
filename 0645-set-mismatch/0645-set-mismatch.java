import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        int duplicate = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            }
        
        }
        int sum=(n*(n+1))/2;
            int sum1=0;
            for(int i=0;i<n;i++){
                sum1+=nums[i];
            }
            int missing=sum-sum1+duplicate;
        
        return new int[]{duplicate, missing};
    }
}