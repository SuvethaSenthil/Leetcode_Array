public class KokoEatingBananas_875 {
    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
    public static int minEatingSpeed(int[] piles,int h){
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(high , pile);
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long hour = 0;
            for(int pile : piles){
                hour += (pile + mid - 1) / mid;
            }
            if(hour <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
