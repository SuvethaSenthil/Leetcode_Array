public class Sum_UniqueElements_1748 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(Sum_UniqueElements(arr));
    }
    public static int Sum_UniqueElements(int[] arr){
        int sumOfUnique = 0;
        for(int i = 0;i < arr.length;i++){
            boolean isUnique = true;
            for(int j = 0;j < arr.length;j++){
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                sumOfUnique += arr[i];
            }
        }
        return sumOfUnique;
    }
}
