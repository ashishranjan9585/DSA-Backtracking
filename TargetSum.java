public class TargetSum {
     static int count = 0;
     public static  int findTargetSumWays(int[] nums , int target){
       compute(nums , 0 , 0 , target);
       return count;
     }
     private static  void compute(int[] nums , int sum , int index , int target){
             //Termination case
             if(index == nums.length){
                if(sum == target){
                    count++;
                }
             }
             else{
                //Incude sum 
                compute(nums, sum + nums[index], index + 1, target);

                //Not Include sum 
                compute(nums, sum - nums[index], index + 1, target);

             }
     }
      public static void main(String[] args) {
            int[] nums = {1,1,1,1,1};
              System.out.println(findTargetSumWays(nums, 3));
      }
}
