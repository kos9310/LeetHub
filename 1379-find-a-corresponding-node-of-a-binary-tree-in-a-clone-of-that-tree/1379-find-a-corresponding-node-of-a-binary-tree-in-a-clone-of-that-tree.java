/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {        
        return nextNode(cloned, target);
    }
    
    public TreeNode nextNode(TreeNode node, TreeNode target) {
        TreeNode resultNode = null;
        if(node.val == target.val) {
            return node;
        }
        if(node.left != null) {
            resultNode = nextNode(node.left, target);
            if(resultNode != null) return resultNode;
        }
        if(node.right != null) {
            resultNode = nextNode(node.right, target);
            if(resultNode != null) return resultNode;
        }
        return resultNode;
    }
}