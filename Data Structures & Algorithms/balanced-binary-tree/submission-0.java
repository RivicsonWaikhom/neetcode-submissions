/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return cHeight(root);
    }
    boolean cHeight(TreeNode node) {
        if (node == null)
            return true;
        int lheight = ht(node.left);
        int rheight = ht(node.right);
        if (Math.abs(lheight - rheight) > 1)
            return false;
        return cHeight(node.right) && cHeight(node.left);
    }
    int ht(TreeNode root) {
        if (root == null)
            return 0;
        int left = ht(root.left);
        int right = ht(root.right);
        return 1 + Math.max(left, right);
    }
}
