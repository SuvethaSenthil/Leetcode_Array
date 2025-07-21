public class JumpGame_55 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(jumpGame(arr));
    }
    public static boolean jumpGame(int[] arr){
        int stepsLeft = arr[0];
        for(int i = 1;i < arr.length;i++){
            stepsLeft--;
            if(stepsLeft < 0){
                return false;
            }
            if(i == arr.length - 1){
                return true;
            }
            if(stepsLeft < arr[i]){
                stepsLeft = arr[i];
            }
        }
        return true;//???
    }
}
