class Solution {
    public boolean checkTree(TreeNode root) {
        boolean result = (root.left.val + root.right.val) == root.val?true:false;
        return result;
    }
}