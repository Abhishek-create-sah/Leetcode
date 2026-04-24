class Solution {
    private boolean help(TreeNode root,long mn , long mx){
        if(root == null) return true ;

        if(root.val <= mn || root.val >= mx) return false ;

        return help(root.right , root.val , mx) && help(root.left , mn , root.val) ;
    }
    public boolean isValidBST(TreeNode root) {
        return help(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
