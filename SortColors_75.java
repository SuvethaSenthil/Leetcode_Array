public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void sortColors(int[] nums){
        int zeroesCount = 0;
        int onesCount = 0;
        for(int num : nums){
            if(num == 0){
                zeroesCount++;
            }
            if(num == 1){
                onesCount++;
            }
        }
        for(int i = 0;i < zeroesCount; i++){
            nums[i] = 0;
        }
        for(int i = zeroesCount;i < zeroesCount + onesCount; i++){
            nums[i] = 1;
        }
        for(int i = zeroesCount + onesCount; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}
