public class BestTime_121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        bestTime(arr);
    }
    public static void bestTime(int[] prices){
        if(prices == null || prices.length == 0){
            return;
        }
        int profit = 0;
        int buying_Price = prices[0];
        for(int i = 0;i < prices.length;i++){
            if(prices[i] < buying_Price){
                buying_Price = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i] - buying_Price);
        }
        System.out.println(profit);
    }
}
