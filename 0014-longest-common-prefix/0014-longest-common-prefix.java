class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String first=strs[0];
    String last=strs[strs.length-1];
    int ind=0;
    while(ind<first.length() && ind<last.length()){
        if(first.charAt(ind)==last.charAt(ind)){
            ind++;
        }
        else{
            break;
        }
    }
    return first.substring(0,ind);
    }
}