import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArray_unique_249 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersectionArray(nums1, nums2);
    }
    public static void intersectionArray(int[] nums1,int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> main = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            set2.add(i);
        }
        for(Integer i : set1){
            if(set2.contains(i)){
                main.add(i);
            }
        }
        int k = 0;
        int[] res = new int[main.size()];
        for(Integer i : main){
            res[k++] = i;
        }
        System.out.println(Arrays.toString(res));
    }
}
