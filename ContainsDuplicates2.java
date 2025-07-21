import java.util.HashSet;

public class ContainsDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicates2(arr, k));
    }
    public static boolean containsDuplicates2(int[] arr,int k){
        int start = 0;
        int end = 0;
        HashSet<Integer> set = new HashSet<>();
        while(end < arr.length){
            if(set.contains(arr[end])){
                return true;
            }
            set.add(arr[end]);
            if(end - start >= k){
                set.remove(arr[start]);
                start++;
            }
            end++;
        }
        return false;
    }
}
