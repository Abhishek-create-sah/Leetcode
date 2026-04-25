class Solution {
    private int cnt = 0 ;
    private int res = 0 ;
    private void inorder(TreeNode root , int k){
        if(root == null) return ;
        inorder(root.left,k);
        cnt++ ;
        if(cnt == k){
            res = root.val ;
            return ;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res ;
    }
}
