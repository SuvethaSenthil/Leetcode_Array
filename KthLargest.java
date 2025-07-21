import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(largest(arr, k));
    }
    public static int largest(int[] arr,int k){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0;i < arr.length;i++){
            if(min.size() < k || arr[i] > min.peek()){
                min.add(arr[i]);
            }
            if(min.size() > k){
                min.poll();
            }
        }
        return min.poll();
    }
}
