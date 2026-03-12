class Solution {
    public boolean validMountainArray(int[] arr) {
       int n=arr.length;
       int peek=0;
       if(n<3) return false;
       for(int i=0;i<n;i++){
        if(arr[i]>arr[peek]){
            peek=i;
        }
       }
       if(peek==0 || peek==n-1){
        return false;
       }
       for(int i=0;i<peek;i++){
        if(arr[i]>=arr[i+1]){
            return false;
        }
       }
       for(int i=peek;i<n-1;i++){
        if(arr[i]<=arr[i+1]){
            return false;
        }
       }
       return true;
    }
}