package Branching_Recursion_BackTrack;
  import java.util.ArrayList;
 public class MazeProblem3 {
       public static  ArrayList<String> getMazePos(int curRow , int curCol , int endRow , int endCol){
             //Termination Case (Positive and Negative case)

             //1. Positive case
             if(curRow  == endRow  && curCol == endCol){
                ArrayList<String> result = new ArrayList<>();
                //it contribute 
                result.add(" ");
                return result;
             }

             //2. Negative case
             if(curRow > endRow || curCol > endCol){
                ArrayList<String> result = new ArrayList<>();
                // its directly return its not  contribute (Blank ArrayList its not traverse )
                return result;
             }
 //All the right and down result store in finalResult

 ArrayList<String> finalResult = new ArrayList<>();

 //Move to the Right
 ArrayList<String> rightResult = getMazePos(curRow, curCol+1, endRow, endCol);
  for(String s : rightResult){
    finalResult.add("R" +s);
  }

   //Move to the Down
 ArrayList<String> downResult = getMazePos(curRow+1, curCol, endRow, endCol);
 for(String s : downResult){
   finalResult.add("D" +s);
 }
 return finalResult;


       }
     public static void main(String[] args) {
          ArrayList<String> ans = getMazePos(0, 0, 2, 2);
          System.out.println(ans);
     }
}
