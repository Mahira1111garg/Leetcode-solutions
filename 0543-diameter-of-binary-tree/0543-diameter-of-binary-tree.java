
class Solution {
    int d=0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
    }
    int height(TreeNode root ){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);

        d=Math.max(d,left+right);
        return 1+Math.max(left,right);
    }
}