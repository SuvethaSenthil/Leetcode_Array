public class LongestIncresing_Subseq_300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(longestIncres_Subseq(nums));
    }
    public static int longestIncres_Subseq(int[] nums){
        int[] sub = new int[nums.length];
        int length = 0;
        for(int num : nums){
            int left = 0,right = length;
            while(left < right){
                int mid = (left + right) / 2;
                if(sub[mid] < num){
                    left = mid + 1;
                }
                else{
                    right = mid;
                }
            }
            sub[left] = num;
            if(left == length){
                length++;
            }
        }
        return length;
    }
}
