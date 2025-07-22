public class ElementAppearing_25percent {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(elementAppearing(arr));
    }
    public static int elementAppearing(int[] arr){
        int n = arr.length;
        int startElement = arr[0];
        int count = 1;
        for(int i = 1;i < n;i++){
            if(arr[i] == arr[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > n / 4){
                return arr[i];
            }
        }
        return startElement;
    }
}
