import java.util.*;
class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root == null) return true;

       int leftH=height(root.left);
       int rightH=height(root.right);

        if(Math.abs(leftH-rightH)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lefth=height(root.left);
        int righth=height(root.right);

        return Math.max(lefth,righth)+1;

    }

}