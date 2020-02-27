// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return check(root.left, root.right);

    }

    private boolean check(TreeNode nA, TreeNode nB) {

        if (nA == null && nB == null) {
            return true;
        }

        if (nA == null || nB == null || nA.val != nB.val) {
            return false;
        }

        return check(nA.left, nB.right) && check(nA.right, nB.left);

    }
}