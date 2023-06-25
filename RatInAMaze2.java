import java.util.*;
public class RatInAMaze2 {
    private static void solve(int row , int col , int board[][] , int n , ArrayList<String> ans , String move , int path[][])
    {
        if(row == n-1 && col == n-1){
            ans.add(move);
            return;
        }

//downward
    if(row+1 < n && path[row+1][col] == 0 && board[row+1][col] == 1){
         path[row][col] = 1;
         solve(row+1, col, board, n, ans, move + "D", path);
         path[row][col] = 0;
    }

//left
   if(col-1 >= 0 && path[row][col - 1] == 0 && board[row][col - 1] == 1){
         path[row][col] = 1;
         solve(row, col-1, board, n, ans, move + "L", path);
         path[row][col] = 0;
    }
//Right 
     if(col+1 < n && path[row][col + 1] == 0 && board[row][col + 1] == 1){
         path[row][col] = 1;
         solve(row, col+1, board, n, ans, move + "R", path);
         path[row][col] = 0;
    }
//Upward
      if(row-1 >= 0 && path[row-1][col] == 0 && board[row-1][col] == 1){
         path[row][col] = 1;
         solve(row-1, col, board, n, ans, move + "U", path);
         path[row][col] = 0;
    }
 }

 public static ArrayList<String> findPath(int[][] res , int n){
    int path[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++){
         for(int j = 0 ; j < n ; j++){
            path[i][j] = 0;
         }
    }
    ArrayList<String> ans = new ArrayList<>();
    if(res[0][0] == 1)
         solve(0,0,res,n,ans , "", path);
         return ans;
    
 } 
 public static void main(String[] args) {
     int n = 4;
     int board[][] = {
        {1,0,0,0},
        {1,1,0,1},
        {1,1,0,0},
        {0,1,1,1},
     };
     ArrayList<String> result = findPath(board, n);
     if(result.size() > 0){
         for(int i = 0 ; i < result.size() ; i++)
            System.out.print(result.get(i) + " ");
         System.out.println();
     }
     else{
        System.out.println(-1);
     }
 }

}
