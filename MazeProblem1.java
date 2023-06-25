package Branching_Recursion_BackTrack;

public class MazeProblem1 {
    public static void mazePathProblem(int curRow , int curCol , int endRow , int endCol , String result){
        //Termination Case (Positive Case & Negative Case)

        //1.Positive case 
        if(curRow == endRow && curCol == endCol){
            System.out.println(result);
            return ;
        }
        if(curRow > endRow  || curCol > endCol){
            return ;
        }

        mazePathProblem(curRow, curCol+1, endRow, endCol, result + "R");
        mazePathProblem(curRow+1, curCol, endRow, endCol, result + "D");
    }
     public static void main(String[] args) {
         mazePathProblem(0, 0, 2, 2, " ");
     }
}
