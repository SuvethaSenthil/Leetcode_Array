import java.util.HashSet;

public class LongestConsecutiveSubseq_128 {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int count = 1;
                while(set.contains(currNum + 1)){
                    currNum ++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
