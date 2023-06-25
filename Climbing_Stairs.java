package Branching_Recursion_BackTrack;
// its return number of possible way ;-
public class Climbing_Stairs {
       public static int climbStairs(int n){
//condition will be given if u go on top u only 1 or 2 steps 
  //Termination case 
    //1.Positive case
            if(n == 1 || n == 2) {
                 return n ;
            }
            //2.Negative case 
            if(n < 1) {
                 return 0;
            }
    int  result = climbStairs(n-1) + climbStairs(n-2);
      return result;
       }
     public static void main(String[] args) {
          System.out.println("No of  ways :- " + climbStairs(5));
     }
}
