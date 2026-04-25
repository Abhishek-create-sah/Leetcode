class Solution {
    private int help(TreeNode root , int[] max){
        if(root == null) return 0 ;

        int lh = Math.max(0,help(root.left,max));
        int rh = Math.max(0,help(root.right,max));

        max[0] = Math.max(max[0],lh+rh+root.val); // otherwise max will create multiple copy , now they will share one among all

        return Math.max(lh,rh)+root.val ;
    }
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE} ;
        help(root,max);
        return max[0]; // pass by rreference
    }
}
