 //GFG - >SubSetSum 
  // This problem is similar to TargetSum

public class SubsetSum {
    static boolean isSubsetSum(int N , int arr[] , int sum) {

        //Termination case 
        if(sum == 0){
            return true;
        }

        //agr aisa ni hua to syad mera array exhaust hogya hai 
        if(N == 0){
             return false;
        }
        if(arr[N-1] <= sum){
            //Include or Not Include dono mese koi ek result la kr dega to or operation laga kr return kr denge
             return isSubsetSum(N-1, arr, sum - arr[N-1]) || isSubsetSum(N-1, arr, sum);
        }
        else{
            //AAGE bdha denge Not Include ko return krwa kr 
            return isSubsetSum(N-1, arr, sum);
        }
    } 
       public static void main(String[] args) {
         int arr[] = {3 ,34,4 ,12, 5 ,2};
         int N = 6 ;
        int  sum = 9;
        System.out.println(isSubsetSum(N, arr, sum));

       }
}
