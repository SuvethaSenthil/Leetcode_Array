public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += nums[i];
        }
        return (n*(n + 1)/2) - sum;
    }
}
