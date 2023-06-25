package Branching_Recursion_BackTrack;

public class RopeCutting {
    public static int ropeCut(int n , int a , int b , int c){
        //Termination Case
         if(n == 0) return 0;
         if(n<0) return  -1;

         //small problem 
         int cutFromA = ropeCut(n-a, a, b, c);
         int cutFromB = ropeCut(n-b, a, b, c);
         int cutFromC = ropeCut(n-c, a, b, c);

         int pieces = Math.max(Math.max(cutFromA , cutFromB) , cutFromC);

         if(pieces == -1) return -1;

         return pieces+1;
    }
     public static void main(String[] args) {
         System.out.println(ropeCut(9, 5, 4, 3));
     }
}
