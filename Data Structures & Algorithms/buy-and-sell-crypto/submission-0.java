class Solution {
    public int maxProfit(int[] prices) {
        // [7 1 5 3 6 4]
            //   l r
        int l = 0;
        int r = 1;
        int maxP = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP,profit);

            }
            else {
                l = r;
            }
            r++;
        }

        return maxP;
    }
}
