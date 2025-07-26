import java.util.*;
public class DistanceValue_TwoArrays_1385{
    public static void main(String[] args){
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        System.out.println(findDistanceValue(arr1,arr2,d));
    }
    public static int findDistanceValue(int[] arr1,int[] arr2,int d){
        Arrays.sort(arr2);
        int distance = 0;
        for(int val : arr1){
            if(notInRange(arr2, val - d, val + d)){
                distance++;
            }
        }
        return distance;
    }
    public static boolean notInRange(int[] arr,int from,int to){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= from && arr[mid] <= to){
                return false;
            }
            else if(arr[mid] < from){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return true;
    }
}