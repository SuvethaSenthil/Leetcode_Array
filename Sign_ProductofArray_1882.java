public class Sign_ProductofArray_1882 {
    public static void main(String[] args){
        int[] nums = {-1 ,-2,-3,-4,3,2,1};
        System.out.println(ProductofArray(nums));
    }
    public static int ProductofArray(int[] nums){
        int negCount = 0;
        for(int num : nums){
            if(num < 0){
                negCount++;
            }
            if(num == 0){
                return 0;
            }
        }
        return negCount % 2 == 0 ? 1 : -1;
    }
}
