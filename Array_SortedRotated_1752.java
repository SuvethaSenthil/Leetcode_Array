public class Array_SortedRotated_1752 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(arraySortedRotated(arr));
    }
    public static boolean arraySortedRotated(int[] arr){
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > arr[(i + 1) % arr.length]){ // Like => 4 % 5 => 4
                count++;
            }
        }
        return count <= 1;
    }
}
