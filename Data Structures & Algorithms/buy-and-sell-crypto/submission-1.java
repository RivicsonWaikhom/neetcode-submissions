class Solution {
    public int maxProfit(int[] prices) {
        int b = prices[0];
        int profit = 0;
        for (int i=0;i< prices.length;i++){
            if (prices[i]< b){
                b = prices[i];
            } else if( prices [i]- b > profit){
                profit = prices[i]- b;
            }
        }
        return profit;
    }
}