public class MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,1,1,1};
        System.out.println(maxConsecutiveOnes(nums));
    }
    public static int maxConsecutiveOnes(int[] nums){
        int count = 0;
        int maxi = 0;
        int prev_maxi = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                count++;
                maxi++;
            }
            if(maxi > prev_maxi){
                prev_maxi = maxi;
            }
            if(nums[i] == 0){
                count = 0;
                maxi = 0;
            }
        }
        return prev_maxi;
    }
}
