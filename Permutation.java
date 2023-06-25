package Branching_Recursion_BackTrack;

public class Permutation {
    public static void perm(String str , String result){
       if(str.length() == 0){
        System.out.println(result);
        return ;
       }
       for(int i = 0 ; i < str.length() ; i++){
        char firstChar = str.charAt(i);
        String leftPart = str.substring(0, i);//basically it consider 0- i - 1
        String rightPart = str.substring(i+1);
        String ans = leftPart + rightPart;
        perm(ans, result + firstChar);
 }
      
    }
    public static void main(String[] args) {
        perm("amit" , " ");
    }
}
