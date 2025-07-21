import java.util.*;
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicates(arr));
    }
    public static boolean containsDuplicates(int[] arr){
        Arrays.sort(arr);
        for(int i = 1;i < arr.length - 1;i++){
            if(arr[i] == arr[i - 1]){
                return true;
            }
        }
        return false;
    }
}
