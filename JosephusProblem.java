package Branching_Recursion_BackTrack;

public class JosephusProblem {
    public static int findTheWinner(int n , int k ){
         return helper(n , k) + 1;
    }

    public  static int  helper(int n , int k ){
         if(n == 1) return 0;
          return (helper(n-1 , k) + k) % n ;
    }
     public static void main(String[] args) {
           System.out.println(findTheWinner(5 , 2));
     } 

}
