class Solution {
    public int maxProfit(int[] prices) {
        int i = 1;
        int minPrice = prices[0];
        int maxProfit = 0;
 
        // [10  , 1 , 5 , 6 , 7 , 1 ]
        //  i     j  


        while(i < prices.length){

           minPrice = Math.min(minPrice,prices[i]);
           maxProfit = Math.max(maxProfit , prices[i] - minPrice);
           i++;
        }


    return maxProfit;
    }
}
