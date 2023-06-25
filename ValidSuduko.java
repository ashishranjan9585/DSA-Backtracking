public class ValidSuduko {
    
    
     private static  boolean isPresentInRow( char[][] board ,int row  , int col , char value)
     {
         //In a Row Traversal in each Col 
         for(int i = 0 ; i < 9 ; i++){
             if( col != i && board[row][i] == value){
                 return true;
             }
         }
         return false;
     }

      private boolean isPresentInCol( char[][] board , int row ,int col, char value)
     {
         //In a Col Traversal in each row 
         for( int i = 0 ; i < 9 ; i++){
             if( row != i && board[i][col] == value){
                 return true;
             }
         }
         return false;
     }

      private boolean isPresentInSubGrid( char[][] board ,int row  , int col , char value){
          int startRow = row - row % 3;
          int startCol = col - col % 3;
          for(int  i = startRow ; i < startRow + 3 ; i++){
              for(int j = startCol ; j < startCol + 3 ; j++){
                  if( row != i && col != j && board[i][j] == value){
                      return true;
                  }
              }
          }
          return false;
      }
     private boolean isCorrectToPlaceANumber(char[][] board , int row , int col , char value){
         //The value is present in row  
         //The value is present in col 
         //The value is present  in subGrid 
         return !isPresentInRow(board ,row , col ,value) && !isPresentInCol( board ,row ,col , value) && !isPresentInSubGrid( board ,row , col , value);
     }
    public boolean isValidSudoku(char[][] board) {
         // Checking every value in the 'board'.
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // If the position is a VALUE (!= '.'), and it is a not a valid placement, then return false.
 if (board[row][col] != '.' && !isCorrectToPlaceANumber(board, row, col , board[row][col]))
                    return false;
            }
        }
        // If all checks succeed, then the 'board' is a valid sudoku.
        return true;
    }
     public static void main(String[] args) {
     char[][] board = {
{"5","3",".",".","7",".",".",".","."}
,{"6",".",".","1","9","5",".",".","."}
,{".","9","8",".",".",".",".","6","."}
,{"8",".",".",".","6",".",".",".","3"}
,{"4",".",".","8",".","3",".",".","1"}
,{"7",".",".",".","2",".",".",".","6"}
,{".","6",".",".",".",".","2","8","."}
,{".",".",".","4","1","9",".",".","5"}
,{".",".",".",".","8",".",".","7","9"}};
  System.out.println(isValidSudoku(board));
     }  
    } 

