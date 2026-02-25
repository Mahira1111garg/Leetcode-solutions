class Solution {
    public int maxArea(int[] height) {
       int n=height.length-1;
       int maxArea=0;
       int left=0;
       int right=n;
      while(left<right){
        int h=Math.min(height[left],height[right]);
        int w=right-left;
        int area=h*w;
        maxArea=Math.max(maxArea,area);
        if(height[right]>height[left]){
            left++;
        }
        else{
            right--;
        }
       } 
       return maxArea;

    }
}