public class Rat_In_Maze1 {

    static boolean isNotBlocked(int board[][] , int row  , int col ){
           if(row < board.length && col < board[row].length && board[row][col] == 1)
           {
                 return true;
           }
           return false;
    }
public static boolean ratInAMaze(int board[][] , int row , int col , int[][] path ){
     if(row == board.length -1 && col == board.length - 1){
         //Mtlb rat in maze  solve hogya hmra path mil gya to hum path ko update krdenge chaiye
          
         path[row][col] = 1;
         return true;
     }
           if(isNotBlocked(board , row , col )) {
            path[row][col] = 1 ;
           

           if(ratInAMaze(board, row+1, col, path)){
                return true;
           }
           if(ratInAMaze(board, row, col+1, path)){
               return true ;
           }
           //Agr iss if me ni jata hai toh wo rasta  ni mila to undo krke aa jynge
           path[row][col] = 0;
        }
        return false;
     }
     public static void main(String[] args) {
        int board[][] = {
            {1,1,0},
            {1,1,1},
            {0,0,1},
        };
        int path[][] = new int[board.length][board.length];
        boolean  result = ratInAMaze(board , 0, 0, path);
        if(result){
            System.out.println("Rat Reach and Path Follow.....");
             for(int i = 0 ; i < path.length ; i++){
                 for(int j = 0 ; j < path[i].length ; j++){
                    System.out.print(path[i][j] + " ");
                 }
                 System.out.println();
             }
        }
        else{
             System.out.println("Rat is Not Reached.....");
        }
     }
}
