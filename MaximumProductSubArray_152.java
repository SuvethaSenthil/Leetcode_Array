public class MaximumProductSubArray_152 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums){
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length;i++){
            int current = nums[i];
            if(current < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(current,current * max);
            min = Math.min(current,current * min);

            result = Math.max(max,result);
        }
        return result;
    }
}
