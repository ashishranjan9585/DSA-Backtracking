package Branching_Recursion_BackTrack;

import java.util.*;
public class PerfectNumber {

    public static ArrayList<Integer>perfect(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i<n ; i++){
            if(isPerfectNumber(i)) list.add(i);
     }
     return list;
        }
    public static boolean isPerfectNumber(int num){
        int sumOfDivisor = findSumOfDivisor(num , 1);
        return sumOfDivisor == num;
    }
   public static int findSumOfDivisor(int num , int divisor){
       if(num == divisor){
           return 0;
       } else if(num % divisor == 0){
           return divisor + findSumOfDivisor(num , divisor+1);
       }
       else{
           return findSumOfDivisor(num , divisor+1);
       }

 }
   public static void main(String[] args) {

    ArrayList<Integer> result =  perfect(1000);
       System.out.println(result);
   }
}
    

