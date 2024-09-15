class Solution {
   public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalResult = new ArrayList<>();
        List<Integer> smallResult = new ArrayList<>();
        helper(nums , finalResult , smallResult);
        return finalResult;
    }
    public void helper(int[] nums , List<List<Integer>> finalResult , List<Integer> smallResult){
         if(smallResult.size() == nums.length) {
             finalResult.add(new ArrayList<>(smallResult));
             return;
         }
         
          for(int n : nums){
            if(!smallResult.contains(n)){
                smallResult.add(n);
            helper(nums , finalResult , smallResult);
            smallResult.remove(smallResult.size()-1); //Undo (Backtrack)
            }
          }
    }
}
