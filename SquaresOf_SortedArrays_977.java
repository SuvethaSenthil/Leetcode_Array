import java.util.Arrays;

public class SquaresOf_SortedArrays_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = squaresOf_SortedArrays(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] squaresOf_SortedArrays(int[] nums){
        for(int i = 0;i < nums.length;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
