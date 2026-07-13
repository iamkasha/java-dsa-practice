class Solution {
    public int maxProfit(int[] prices) {
        
        int minBuy = prices[0];
        int maximumProfit = 0;

        for(int i=0; i<prices.length; i++){

            minBuy = Math.min(minBuy, prices[i]);

            int diff = prices[i] - minBuy;
            if(diff > maximumProfit){
                maximumProfit = diff;
            }
        }
        return maximumProfit;
    }
}