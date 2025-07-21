public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        singleNumber(arr);
    }
    public static void singleNumber(int[] arr){
        int xor = 0;
        for(int x : arr){
            xor = xor ^ x;
        }
        System.out.println(xor);
    }
}
