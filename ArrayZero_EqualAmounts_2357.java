import java.util.HashSet;

public class ArrayZero_EqualAmounts_2357 {
    public static void main(String[] args) {
        int[] arr = {1,5,0,3,5};
        System.out.println(arrayZero_EqualAmounts(arr));
    }
    public static int arrayZero_EqualAmounts(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                set.add(arr[i]);
            }
        }
        return set.size();
    }
}
