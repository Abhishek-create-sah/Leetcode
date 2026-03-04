// very minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

class Solution {
    private void dfs(int[][] grid,int[][] time , int i , int j ,int cur){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||grid[i][j] == 0 || cur >= time[i][j]) return;
        time[i][j] = cur ;
        dfs(grid,time,i+1,j,cur+1);
        dfs(grid,time,i-1,j,cur+1);
        dfs(grid,time,i,j+1,cur+1);
        dfs(grid,time,i,j-1,cur+1);

    }
    public int orangesRotting(int[][] grid) {
       if(grid.length == 0 || grid[0].length == 0) return -1 ;

       int n = grid.length ; int m = grid[0].length ; 
       int[][] time = new int[n][m]; 

       for(int i = 0 ; i < n ; i++){
        Arrays.fill(time[i],Integer.MAX_VALUE);
       }

       for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < m ; j++){
            if(grid[i][j] == 2){
                dfs(grid,time,i,j,0);
            }
        }
       }

       int tmReq = 0 ;
       for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < m ; j++){
            if(grid[i][j] == 1){
                if(time[i][j] == Integer.MAX_VALUE) return -1;
                tmReq = Math.max(tmReq,time[i][j]);
            }
        }
       }
       return tmReq;
    }
}