import java.util.*;
public class GenerateParanthesis {
     public static ArrayList<String> generateParenthesis(int n){
          ArrayList<String> result = new ArrayList<>();
          StringBuilder sb = new StringBuilder();
        generateBrackets(result, n, 0, 0, sb);
          return result ;
     }

      static void generateBrackets(ArrayList<String> result , int n , int opening , int closing , StringBuilder output){
          //Termination case 
          if(output.length() == n * 2){
             result.add(output.toString());
             return ;
          }
          //Can i Place Opening 
          if(opening < n){
            output.append("(");
            generateBrackets(result, n, opening + 1, closing, output);

             //Stack fall--> time ye output pura fill ho jyega toh issy khali krna hoga
             // to hum deleteCharAt ka method use  krnge jo stringBuilder se ata hai 
             output.deleteCharAt(output.length() - 1);
          }

          //Can i Place Closing
          if(closing < opening){
            output.append(")");
            generateBrackets(result, n, opening, closing + 1, output);

            //Stack fall - time 
             output.deleteCharAt(output.length() - 1);
          }
      }
     public static void main(String[] args) {
         int n = 3 ;
         System.out.print(generateParenthesis(n));
     }
}
