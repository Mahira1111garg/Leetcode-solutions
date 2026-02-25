class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            if(cur>maxSum){
                maxSum=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return maxSum;
    }
}