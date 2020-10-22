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
    private int len;
    private boolean found = false;
    
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        TreeNode current = root;
        int path = 0;
        searchHelper(current, path);
        return len;
    }
    public void searchHelper(TreeNode current, int path){
        int both = 0;
        ++path;
        if(current.left != null){
            ++both;
            searchHelper(current.left, path);
        }
        if(current.right != null){
            ++both;
            searchHelper(current.right, path);
        }
        System.out.println(path);
        if(both == 0){
            if(!found){
                len = path;
                found = true;
            }
            if(path < len){
                len = path;
            }
        }
    }
}


