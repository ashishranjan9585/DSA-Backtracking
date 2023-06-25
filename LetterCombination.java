import java.util.*;

public class LetterCombination {

   
    public static ArrayList<String> letterCombinations(String digits) {
         if(digits.length() == 0){
          ArrayList<String> list = new ArrayList<>();
          return list;
      }
       return  helperletterCombinations(digits);
    }
  public static  ArrayList<String> helperletterCombinations(String digits) {
 String[] phoneKeys = {"" ," " , "abc" , "def" , "ghi" ,"jkl" , "mno" ,"pqrs" ,"tuv", "wxyz"};
      //Termination case
      if(digits.length() == 0){
          ArrayList<String> list = new ArrayList<>();
          list.add("");
          return list;
      }
      //Get the first character from the string (e.g - digit)

      char Firstchar = digits.charAt(0);
      //get the index so convert character into integer
      int index = Firstchar - '0';   //'0' - 48 '1' - 49 '2'- 50 (50 - 48) = 2 index  nikal kar aa jyega
      String phoneKey = phoneKeys[index];

      //RemainingString ke liye matlb 3 ke liye string ko chota kr lenge
      String remString = digits.substring(1);

      //fir Ek List mein store krlenge jo v result aaya 
       ArrayList<String> finalList = new ArrayList<>();
       //fir ek for loop chalyngre jo pura traverse krega phonekey ko 
       //jo bhi yha se result aa rha hoga ussy finallist me store krna prega
       for(int i = 0 ; i< phoneKey.length() ; i++){
           ArrayList<String> result = helperletterCombinations(remString);
           for(String s : result){
               finalList.add(phoneKey.charAt(i) + s); // pehla character jo aya or new result aaya ussy concat krlenge

           }
       } 
       return finalList;
  }
     public static void main(String[] args) {
        String digits = "23";
         System.out.print(letterCombinations(digits));
     }
}
