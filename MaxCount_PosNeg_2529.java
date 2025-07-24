public class MaxCount_PosNeg_2529 {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maxCount(nums));
    }
    public static int maxCount(int[] nums){
        if(posCount(nums) == negCount(nums)){
            return posCount(nums);
        }
        if(posCount(nums) > negCount(nums)){
            return posCount(nums);
        }
        else{
            return negCount(nums);
        }
    }
    public static int posCount(int[] nums){
        int pCount = 0;
        for(int num : nums){
            if(num > 0){
                pCount++;
            }
        }
        return pCount;
    }
    public static int negCount(int[] nums){
        int nCount = 0;
        for(int num : nums){
            if(num < 0){
                nCount++;
            }
        }
        return nCount;
    }
}
