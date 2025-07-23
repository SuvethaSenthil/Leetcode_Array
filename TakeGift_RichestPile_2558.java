import java.util.PriorityQueue;

public class TakeGift_RichestPile_2558 {
    public static void main(String[] args) {
        int[] gifts = {25,64,9,4,100};
        int k = 4;
        System.out.println(takeGift(gifts, k));
    }
    public static int takeGift(int[] gifts,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b - a));
        for(int gift : gifts){
            maxHeap.add(gift);
        }
        while(k-- > 0){
            maxHeap.add((int)(Math.floor(Math.sqrt(maxHeap.poll()))));
        }
        int ans = 0;
        while(maxHeap.size() > 0){
            ans += maxHeap.poll();
        }
        return ans;
    }
}
