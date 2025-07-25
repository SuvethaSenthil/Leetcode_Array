import java.util.Arrays;

public class DivideArray_EqualPairs_2206 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2};
        System.out.println(divideArray_EqualPairs(arr));
    }
    public static boolean divideArray_EqualPairs(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(count == 0 || arr[i] == arr[i - 1]){
                count++;
                continue;
            }
            if(arr[i] != arr[i - 1]){
                if(count % 2 == 1){
                    return false;
                }
                count = 1;
            }
        }
        return count % 2 == 0;
    }
}
