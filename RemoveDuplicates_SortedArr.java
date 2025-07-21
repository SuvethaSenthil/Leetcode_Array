public class RemoveDuplicates_SortedArr {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr){
        int index = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] > arr[i - 1]){
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
