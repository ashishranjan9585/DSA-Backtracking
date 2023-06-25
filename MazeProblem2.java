package Branching_Recursion_BackTrack;

public class MazeProblem2 {
    public static void mazePathProblem(int curRow , int curCol , int endRow , int endCol , String result ){
         //Termination case (Positive and Negative case) 

         // 1 Positive case 
         if(curRow == endRow && curCol == endCol){
            System.out.println(result);
            return ;
        }
        if(curRow > endRow  || curCol > endCol){
            return ;
        }
        mazePathProblem(curRow, curCol+1, endRow, endCol, result + "R");
        mazePathProblem(curRow+1, curCol, endRow, endCol, result + "D");
        mazePathProblem(curRow+1, curCol+1, endRow, endCol, result + "O");

    }
    public static void main(String[] args) {
        mazePathProblem(0, 0, 2, 2, " ");
    }
}
