class Solution {
    public int maxProfit (int [] prices){
        int minprice = prices[0];
        int maxProfit = 0;

        for(int i=0 ; i<prices.length ; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }

            int currProfit = prices[i] - minprice;

            if(currProfit > maxProfit){
                maxProfit = currProfit;
            } 
        }
        return maxProfit ;
    }
}