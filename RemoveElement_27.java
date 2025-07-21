public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr, val));
    }
    public static int removeElement(int[] arr,int val){
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
