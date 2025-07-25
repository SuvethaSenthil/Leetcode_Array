import java.util.HashMap;
public class CheckN_DoubleExist_1346 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(doubleExist(arr));
    }
    public static boolean doubleExist(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i] , i);
        }
        for(int i = 0;i < arr.length;i++){
            if(map.containsKey(2 * arr[i]) && i != map.get(2 * arr[i])){
                return true;
            }
        }
        return false;
    }
}
